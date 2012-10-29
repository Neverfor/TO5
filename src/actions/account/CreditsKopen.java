package actions.account;

import java.util.Map;

import javax.persistence.Query;
import org.hibernate.*;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import domein.Account;
import dao.AccountDAO;

public class CreditsKopen extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Account account;
	private AccountDAO accountDAO = new AccountDAO();
	private int cNieuw,cOud;

	public int getCOud() {
		return cOud;
	}

	public void setCOud(int cOud) {
		this.cOud = cOud;
	}
	
	public int getCNieuw() {
		return cNieuw;
	}

	public void setCNieuw(int cNieuw) {
		this.cNieuw = cNieuw;
	}

	public String execute(){
		account.setCredits(cNieuw+cOud);
		accountDAO.saveAccount(account);
		return SUCCESS;
	}
	
	public Account getAccount() {
		return account;
	}

	
	
	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		account = (Account)session.get("account");
	}
}
