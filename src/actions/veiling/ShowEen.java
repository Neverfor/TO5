package actions.veiling;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import dao.VeilingDAO;
import domein.Account;
import domein.Veiling;

public class ShowEen extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;	
	private Account account;
	private int id;
	private VeilingDAO veilingDAO;
	private Veiling veiling;
	
	public String execute(){
		veiling = veilingDAO.getVeiling(id);
		System.out.println(veiling.getId());
		System.out.println(veiling.getTitel());
		System.out.println(veiling.getAccount().getVoornaam());
		return SUCCESS;
	}	
	
	public Veiling getVeiling() {
		return veiling;
	}

	public void setVeiling(Veiling veiling) {
		this.veiling = veiling;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ShowEen(){
		veilingDAO = new VeilingDAO();
	}

	@Override
	public void setSession(Map<String, Object> session) {
		account = (Account)session.get("account");
		
	}
}
