package actions.veiling;


import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import dao.VeilingDAO;
import domein.Account;
import domein.Rubriek;

public class getRubrieken extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;	

	private VeilingDAO veilingDAO;
	private Account account;
	private List<Rubriek> rubrieken; 

	public List<Rubriek> getRubrieken() {
		return rubrieken;
	}

	public void setVeilingen(List<Rubriek> rubrieken) {
		this.rubrieken = rubrieken;
	}

	public getRubrieken(){
		veilingDAO = new VeilingDAO();
	}

	public String execute(){
		rubrieken = veilingDAO.getRubrieken();
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		account = (Account)session.get("account");

	}
}