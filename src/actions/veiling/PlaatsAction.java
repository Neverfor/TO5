package actions.veiling;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.AccountDAO;
import dao.VeilingDAO;
import domein.Account;
import domein.Rubriek;
import domein.Veiling;

public class PlaatsAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Veiling veiling = new Veiling();
	
	private VeilingDAO veilingDAO;
	private int veilingDuur;
	private String titel;
	private String omschrijving;
	private String minimumBod;
	private Integer rubriek;
	private Account account;
	private List<Rubriek> rubrieken; 
	
	public List<Rubriek> getRubrieken() {
		return rubrieken;
	}
	
	public PlaatsAction(){
		veilingDAO = new VeilingDAO();
	}
		
	public String execute(){
		veiling.setAccount(account);
		veiling.setStatus("actief");
		veiling.setBeginDatum(new Date());
		veiling.setTitel(titel);
		rubrieken = veilingDAO.getRubrieken();	
		veiling.setRubriek(veilingDAO.getRubriek(rubriek));
		Calendar cal = Calendar.getInstance();
		cal.setTime(veiling.getBeginDatum());
		cal.add(Calendar.DATE, veilingDuur);
		veiling.setEindDatum(cal.getTime());
		if(veilingDAO.saveVeiling(veiling)){
			return SUCCESS;
		}
		return INPUT;
	}
	
	public int getVeilingDuur() {
		return veilingDuur;
	}
	public void setVeilingDuur(int veilingDuur) {
		this.veilingDuur = veilingDuur;
	}
	
	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	
	public Integer getRubriek() {
		return rubriek;
	}

	public void setRubriek(Integer rubriek) {
		this.rubriek = rubriek;
	}
	
	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public String getMinimumBod() {
		return minimumBod;
	}

	public void setMinimumBod(String minimumBod) {
		this.minimumBod = minimumBod;
	}
	
	public String submit(){
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		account = (Account)session.get("account");
		
	}
}
