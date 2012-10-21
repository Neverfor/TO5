package utils;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import domein.Aanbieder;
import domein.Account;

public class SecurityInterceptor implements Interceptor {
	private String userRole;
	
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
		if(account == null || !account.getRoles().contains(userRole)){
			return Action.LOGIN;
		}

		return actionInvocation.invoke();
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
}
