package actions.account;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import domein.Account;

public class CreditForm extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Account account = new Account();
	private Double cOud;
	
	public Double getCOud() {
		return cOud;
	}

	public String execute(){
		cOud = account.getCredits();
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
