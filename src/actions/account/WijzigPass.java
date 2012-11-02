package actions.account;

import java.util.Map;

import javax.persistence.Query;
import org.hibernate.*;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domein.Account;
import dao.AccountDAO;

public class WijzigPass extends ActionSupport implements SessionAware, ModelDriven<Account> {

	private static final long serialVersionUID = 1L;
	private Account account;
	private AccountDAO accountDAO = new AccountDAO();
	private String wachtwoordBevestiging;

//	public String getWachtwoord() {
//		return wachtwoord;
//	}
//
//	public void setWachtwoord(String wachtwoord1) {
//		this.wachtwoord = wachtwoord1;
//	}
//
//	public String getWachtwoord2() {
//		return wachtwoord2;
//	}
//
//	public void setWachtwoord2(String wachtwoord2) {
//		this.wachtwoord2 = wachtwoord2;
//	}

	public String getWachtwoordBevestiging() {
		return wachtwoordBevestiging;
	}

	public void setWachtwoordBevestiging(String wachtwoordBevestiging) {
		this.wachtwoordBevestiging = wachtwoordBevestiging;
	}

	public String execute(){		
		accountDAO.makePersistent(account);
		return SUCCESS;
	}
	
//	public void validate() {
//		System.out.println(wachtwoord);
//		System.out.println(wachtwoord2);
//		if (!wachtwoord.equals(wachtwoord2)){			
//			addFieldError( "wachtwoord", "Wachtwoorden komen niet overheen!");
//		}
//	}
	
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
	
	
	public Account getModel() {
		return account;
	}
	
}
