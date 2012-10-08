package utils;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import domein.Account;

public class SecurityInterceptor implements Interceptor {

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
//		Object action = actionInvocation.getAction();
//		if (action instanceof SecurableAction) {
//			((SecurableAction) action).checkSecurity();
//		}

		return actionInvocation.invoke();
	}
}
