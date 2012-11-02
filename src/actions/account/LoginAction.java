package actions.account;

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
//		if(session.containsValue(account)){
//			addActionError("Account is al ingeloogd!");
//			return INPUT;
//		}
//		else 
		System.out.println("test " + emailadres);
		System.out.println(account.getVoornaam());
		session.put( "account", account );
		return SUCCESS;
	}
	
	public String input() {
		if (session.get("account") != null) {
			return "REDIRECT";
		}
		return SUCCESS;
	}

	public void validate(){		
		account = accountDAO.findAccount(emailadres, wachtwoord);
		if(account == null){
			addActionError("Geen geldige username of wachtwoord.");
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
	
	public Account getAccount() {
		return account;
	}
	
	public void logOut(){
		session.remove("account");
	}
}
