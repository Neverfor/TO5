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
	private String wachtwoordBevestiging;
	private AccountDAO accountDAO;
	
	public RegisterAction(){
		accountDAO = new AccountDAO();
	}
	public String getWachtwoordBevestiging() {
		return wachtwoordBevestiging;
	}

	public void setWachtwoordBevestiging(String wachtwoordBevestiging) {
		this.wachtwoordBevestiging = wachtwoordBevestiging;
	}

	public String execute() {
		if(accountDAO.saveAccount(account)){
			return SUCCESS;
		}
		return INPUT;
	}	
	
	public Account getModel() {
		return account;
	}
	
	public String submit(){
		return SUCCESS;
	}
	
	public void validate(){
		if(accountDAO.emailadresExists(account.getEmailadres())){
			addFieldError( "emailadres", "Emailadres al in gebruik" );
		}
	}
}
