package actions.account;

import com.opensymphony.xwork2.ActionSupport;

import dao.AccountDAO;
import domein.Account;

public abstract class abstractSaveAccountAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	protected Account account;
	protected AccountDAO accountDAO = new AccountDAO();
	
	public String execute(){
		if(accountDAO.saveAccount(account))
			return SUCCESS;
		else
			return INPUT;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
