package dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import domein.Account;

public class AccountDAO {
		private Session session;
		private Transaction transaction;
		private static SessionFactory sessionFactory;
		private static ServiceRegistry serviceRegistry;
		
		public AccountDAO(){
			try{
				Configuration configuration = new Configuration().configure();
				serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
				SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	            session = sessionFactory.openSession();            
	            System.out.println("Sessie open");
	        }catch (HibernateException hibernateException) {
	            System.out.println(hibernateException.getMessage());
	            session.close();
	
	        }
	
		}
	 
		public boolean saveAccount(Account account){
			try{
				Transaction transaction = session.beginTransaction();
	            session.saveOrUpdate(account);
	            transaction.commit();
	            return true;
			}catch (HibernateException hibernateException) {
	            System.out.println(hibernateException.getMessage());
	            session.close();
	            return false;
	        }
		}
		
		public Account getAccount(Integer id){
			return (Account) session.createQuery("from Account where id = ?").setInteger(0, id).uniqueResult();

		}
		public boolean emailadresExists(String emailadres){
			Query query = session.createQuery("select count(*) from Account where Emailadres = :emailaddr ");
			query.setParameter("emailaddr", emailadres);
			if(((Long)query.uniqueResult()).intValue() > 0){
				return true;
			}
			return false;
		}
}
