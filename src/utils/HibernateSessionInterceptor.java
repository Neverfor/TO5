package utils;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class HibernateSessionInterceptor implements Interceptor {

	private static Logger log = Logger
			.getLogger(HibernateSessionInterceptor.class);
	private static SessionFactory sf = HibernateUtil.getSessionFactory();

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		try {
			boolean isActive = sf.getCurrentSession().getTransaction()
					.isActive();
			if (!isActive) {
				log.debug("Starting a database transaction");
				sf.getCurrentSession().beginTransaction();
			}

			log.debug("Invoking the aspectized service method");
			String result = invocation.invoke();

			// Commit and cleanup
			if (!isActive) {
				log.debug("Committing the database transaction");
				sf.getCurrentSession().getTransaction().commit();
			}

			return result;

		} catch (StaleObjectStateException staleEx) {
			log.error("This interceptor does not implement optimistic concurrency control!");
			log.error("Your application will not work until you add compensation actions!");
			// Rollback, close everything, possibly compensate for any permanent
			// changes
			// during the conversation, and finally restart business
			// conversation. Maybe
			// give the user of the application a chance to merge some of his
			// work with
			// fresh data... what you do here depends on your applications
			// design.
			throw staleEx;
		} catch (Throwable ex) {
			// Rollback only
			try {
				log.warn("Trying to rollback database transaction after exception");
				sf.getCurrentSession().getTransaction().rollback();
			} catch (Throwable rbEx) {
				log.error("Could not rollback transaction after exception!",
						rbEx);
			}
			// Let others handle it... maybe another interceptor for exceptions?
			throw ex;
		}
	}

}
