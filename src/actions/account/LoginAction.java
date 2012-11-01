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
		System.out.println("test " + emailadres);
		System.out.println(account.getVoornaam());
		session.put( "account", account );
//		session.put("voornaam", account.getVoornaam());
//		account = (Account)session.get(account);
		//System.out.println(account.getAchternaam());
		return SUCCESS;
	}

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
	
	public Account getAccount() {
		return account;
	}
	
	public void logOut(){
		session.remove("account");
	}
}
