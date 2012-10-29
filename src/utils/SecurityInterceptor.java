package utils;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import domein.Account;
import domein.Recht;

public class SecurityInterceptor implements Interceptor {
	private Recht recht;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {		
		Account account = (Account) actionInvocation.getInvocationContext().getSession().get("account");		
		if(account == null || (recht != null && !account.getRechten().contains(recht))){
			return Action.LOGIN;
		}

		return actionInvocation.invoke();
	}

	public Recht getRecht() {
		return recht;
	}

	public void setRecht(String recht) {
		this.recht = new Recht(recht);
	}
	
}
