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
//		if(account.getAccstatus()==0){
//			System.out.println("account is geblokeerd");
//			addActionError("Dit account is geblokeerd! Neem zo spoedig mogelijk contact met administratie!");
//			return ActionSupport.ERROR;
//		}
//		if(account.getAccstatus()==2 || Integer.toString(account.getAccstatus())==null || Integer.toString(account.getAccstatus()).equals("")){
//			System.out.println("account is al online");
//			addActionError("Dit account is al ingelogd!");
//			return ActionSupport.INPUT;
//		}
		System.out.println("test " + emailadres);
		System.out.println(account.getVoornaam());
		session.put( "account", account );
//		account.setAccstatus(2);
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
	
	public String logOut(){
		session.remove("account");
		return SUCCESS;
	}
}
