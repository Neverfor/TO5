package actions.veiling;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import dao.VeilingDAO;
import domein.Account;
import domein.Veiling;

public class zoekVeiling extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;	

	private VeilingDAO veilingDAO;
	private Account account;
	private Integer rubriek;
	private String zoekterm;
	private List<Veiling> veilingen = new ArrayList<Veiling>(); 

	public Integer getRubriek() {
		return rubriek;
	}

	public void setRubriek(Integer rubriek) {
		this.rubriek = rubriek;
	}

	public String getZoekterm() {
		return zoekterm;
	}

	public void setZoekterm(String zoekterm) {
		this.zoekterm = zoekterm;
	}

	public List<Veiling> getVeilingen() {
		return veilingen;
	}

	public void setVeilingen(List<Veiling> veilingen) {
		this.veilingen = veilingen;
	}

	public zoekVeiling(){
		veilingDAO = new VeilingDAO();
	}

	public String execute(){
		if(rubriek == -1) {
			veilingen = (List<Veiling>) veilingDAO.zoekVeilingen(zoekterm);
		}
		else {
			veilingen = (List<Veiling>) veilingDAO.zoekVeilingen(rubriek, zoekterm);
		}
		if(veilingen == null) {
			return INPUT;
		}
		return SUCCESS;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		account = (Account)session.get("account");
	}
}
