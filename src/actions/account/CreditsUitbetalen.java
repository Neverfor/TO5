package actions.account;

import java.util.Map;

import javax.persistence.Query;
import org.hibernate.*;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import domein.Account;
import dao.AccountDAO;

public class CreditsUitbetalen extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Account account;
	private AccountDAO accountDAO = new AccountDAO();
	private Double cNieuw,cOud;

	public Double getCOud() {
		return cOud;
	}

	public void setCOud(Double cOud) {
		this.cOud = cOud;
	}
	
	public Double getCNieuw() {
		return cNieuw;
	}

	public void setCNieuw(Double cNieuw) {
		this.cNieuw = cNieuw;
	}

	public String execute(){
		account.setCredits(cOud-cNieuw);
		accountDAO.makePersistent(account);
		System.out.println(account.getVoornaam());
		return SUCCESS;
	}
	
	public void validate(){
		if(cNieuw > cOud && cOud <= 0){
			addFieldError("cNieuw", "Niet genoeg credits!");
		}
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
