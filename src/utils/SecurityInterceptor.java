package utils;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ValidationAware;
import com.opensymphony.xwork2.interceptor.Interceptor;

import domein.Account;
import domein.Recht;

public class SecurityInterceptor implements Interceptor, SessionAware {
	private String recht;
	
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
		if(account == null || (recht != null && !account.hasRecht(recht))){
			if (actionInvocation.getAction() instanceof ValidationAware)
	        {
	            ((ValidationAware)actionInvocation.getAction()).addActionMessage("Geen rechten tot deze pagina");
	        }
			return Action.LOGIN;
		}

		return actionInvocation.invoke();
	}

	public String getRecht() {
		return recht;
	}

	public void setRecht(String recht) {
		this.recht = recht;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// Account account = (Account) actionInvocation.getInvocationContext().getSession().get("account");
		
	}
}
