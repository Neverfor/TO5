package accountActions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import domein.Account;

public class LoginAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Account account;
	private Map<String, Object> session;
	private String email;
	private String wachtwoord;
	
	public String execute(){
		session.put( "account", account );
//		if (account.getUr().equals(accountRole.Administrator))
//			return "administratormenu";
//		if (account.getUr().equals(accountRole.Member))
//			return "membermenu";
		return SUCCESS;
	}
	//New regel

	public void validate(){
		
		wachtwoord = wachtwoord.trim();
		email = email.trim();
		
		if ( email.length() == 0 ){			
			addFieldError( "email", "naam is verplicht");
		}
		if ( wachtwoord.length() == 0 ){			
			addFieldError( "password", "wachtwoord is verplicht" );
		}
		
//	    account = ivs.getaccountByaccountname(accountname);
//		if ((account == null) || !(account.getPassword().equals(password))){
//			addFieldError("accountname", "naam of wachtwoord is niet juist");
//		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
//	public String getPassword() {
//		return password;
//	}
	
	public void setPassword(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}
	
	public Account getaccount() {
		return account;
	}


}
