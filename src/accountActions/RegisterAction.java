package accountActions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.AccountDAO;
import domein.Account;

public class RegisterAction extends ActionSupport implements ModelDriven<Account> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2534446146222716771L;
	private Account account = new Account();
	private AccountDAO accountDAO = new AccountDAO();

	public String execute() throws Exception {
		accountDAO.saveAccount(account);
		return SUCCESS;
	}	
	
	public Account getModel() {
		return account;
	}
}
