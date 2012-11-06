package unittests;

import static org.junit.Assert.fail;
import java.util.List;
import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import utils.HibernateUtil;
import dao.AccountDAO;
import dao.GenericHibernateDAO;
import dao.VeilingDAO;
import dao.BodDAO;
import domein.Account;
import domein.Bod;

public class BodTest {
	private static SessionFactory sf = HibernateUtil.getSessionFactory();
	
	private static VeilingDAO veilingDAO;
	private static AccountDAO accountDAO;
	private static BodDAO bodDAO;
	
	
	@BeforeClass
	public static void setUpBeforeClass(){
		sf.getCurrentSession().beginTransaction();
		veilingDAO = new VeilingDAO();
		accountDAO = new AccountDAO();
		bodDAO	   = new BodDAO();
	}
			
	@Test
	public void test() throws Exception {

		

		GenericHibernateDAO<Account, Integer> accountDAO = new AccountDAO();
		List<Account> test = accountDAO.findAll();
		if (test == null || test.isEmpty()) {
			fail("niet goed");
		}
	}
	
	@Test
	public void testGetBodVanVeiling() {
		List<Bod> biedingen = (List<Bod>) veilingDAO.findById(8).getBiedingen();
		System.out.println(biedingen);
		if(biedingen.isEmpty()){
			fail("Veiling heeft geen biedingen");
		}
	}

	@Test
	public void testGetAlleBiedingen() {
		List<Bod> biedingen = (List<Bod>) bodDAO.getBiedingenByID(8);
		System.out.println("Alle biedingen zijn van veiling met id 8:" + biedingen);
		if(biedingen.isEmpty()){
			fail("Veiling heeft geen biedingen");
		}
	}

}
