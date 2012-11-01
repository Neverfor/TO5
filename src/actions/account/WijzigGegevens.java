package actions.account;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import domein.Account;

public class WijzigGegevens extends abstractSaveAccountAction implements SessionAware {

	private static final long serialVersionUID = 1L;

	@Override
	public void setSession(Map<String, Object> session) {
		account = (Account)session.get("account");
	}
}
