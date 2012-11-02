package actions.beheren;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.AccountDAO;
import domein.Account;

public class BeheerAccountsAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private List<Account> accounts;
	private AccountDAO accountDAO;
	
	public String execute(){
		accountDAO = new AccountDAO();
		setAccounts(accountDAO.findAll());
		
		return ActionSupport.SUCCESS;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
}
