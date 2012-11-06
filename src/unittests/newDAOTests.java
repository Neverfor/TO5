package unittests;

import static org.junit.Assert.fail;
import java.util.List;
import org.hibernate.SessionFactory;
import org.junit.Test;
import utils.HibernateUtil;
import dao.AccountDAO;
import dao.GenericHibernateDAO;
import domein.Account;

public class newDAOTests {
	private static SessionFactory sf = HibernateUtil.getSessionFactory();

	@Test
	public void test() throws Exception {

		sf.getCurrentSession().beginTransaction();

		GenericHibernateDAO<Account, Integer> accountDAO = new AccountDAO();
		List<Account> test = accountDAO.findAll();
		if (test == null || test.isEmpty()) {
			fail("niet goed");
		}
	}

}
