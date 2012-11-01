package unittests;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.struts2.StrutsTestCase;
import org.junit.Test;

import dao.AccountDAO;
import dao.GenericHibernateDAO;
import domein.Account;

public class newDAOTests extends StrutsTestCase{

	@Test
	public void test() {		
		
		GenericHibernateDAO<Account, Integer> accountDAO = new AccountDAO();
	    List<Account>test = accountDAO.findAll();
	    if(test == null || !test.isEmpty()){
	    	fail("niet goed");
	    }
	}

}
