package actions.account;

import java.util.Map;

import javax.persistence.Query;
import org.hibernate.*;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import domein.Account;
import dao.AccountDAO;

public class WijzigGegevens extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Account account;
	private AccountDAO accountDAO = new AccountDAO();

	public String execute(){		
		System.out.println("/nStart wijzigen gegevens bij de account met id" + account.getId() + " en naam" + account.getVoornaam());
		accountDAO.saveAccount(account);
		System.out.println("/nEind van wijzigen van de gegevens van de account met id" + account.getId() + " en naam" + account.getVoornaam());
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
