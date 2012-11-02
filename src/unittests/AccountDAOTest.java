package unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dao.AccountDAO;
import domein.Account;

public class AccountDAOTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		AccountDAO accountDAO = new AccountDAO();
		Account michael = accountDAO.findById(1);
		if(michael == null){
			fail();
		}
	}

}
