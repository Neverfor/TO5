package actions.veiling;


import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import dao.VeilingDAO;
import domein.Account;
import domein.Veiling;

public class Show extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;	
	
	private VeilingDAO veilingDAO;
	private Account account;
	private List<Veiling> veilingen; 
	
	public List<Veiling> getVeilingen() {
		return veilingen;
	}

	public void setVeilingen(List<Veiling> veilingen) {
		this.veilingen = veilingen;
	}

	public Show(){
		veilingDAO = new VeilingDAO();
	}
		
	public String execute(){
		veilingen = veilingDAO.findAllFromAccount(account);
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		account = (Account)session.get("account");
		
	}
}
