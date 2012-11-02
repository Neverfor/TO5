package unittests;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.StrutsTestCase;
import org.junit.Test;

import actions.veiling.ShowAlle;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionProxy;

import dao.AccountDAO;
import dao.GenericHibernateDAO;
import domein.Account;

public class newDAOTests extends StrutsTestCase {

	public void test() throws Exception {
		ActionProxy proxy = getActionProxy("/index");
	    String result = proxy.execute();

		
		GenericHibernateDAO<Account, Integer> accountDAO = new AccountDAO();
	    List<Account>test = accountDAO.findAll();
	    if(test == null || !test.isEmpty()){
	    	fail("niet goed");
	    }
	}

}
