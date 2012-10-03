package accountActions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.AccountDAO;
import domein.Account;

public class LoginAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Account account;
	private Map<String, Object> session;
	private String emailadres;
	private String wachtwoord;
	private AccountDAO accountDAO;
	
	public LoginAction(){
		accountDAO = new AccountDAO();
	}
		

	public String execute(){
		session.put( "account", account );
		return SUCCESS;
	}
	//New regel
	//New regel2

	public void validate(){		
		account = accountDAO.getAccount(emailadres, wachtwoord);
		if(account == null){
			addActionError("Geen geldige username of wachtwoord");
		}
	}
	
	public String getEmailadres() {
		return emailadres;
	}
	
	public void setEmailadres(String emailadres) {
		this.emailadres = emailadres;
	}
	

	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}
	
	public String getWachtwoord() {
		return wachtwoord;
	}

	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	
	public Account getaccount() {
		return account;
	}

	//kijk een conflict
}
