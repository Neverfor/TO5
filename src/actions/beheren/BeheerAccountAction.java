package actions.beheren;

import com.opensymphony.xwork2.ActionSupport;

import dao.AccountDAO;
import domein.Account;

public class BeheerAccountAction extends ActionSupport {
	private AccountDAO accountDAO = new AccountDAO();
	private Account account;
	private Integer id;
	
	public String execute(){
		 account = accountDAO.getAccount(id);
		return SUCCESS;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}
}
