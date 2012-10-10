package actions.veiling;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.AccountDAO;
import dao.VeilingDAO;
import domein.Rubriek;
import domein.Veiling;

public class PlaatsAction extends ActionSupport implements ModelDriven<Veiling> {

	private static final long serialVersionUID = 1L;
	private Veiling veiling = new Veiling();
	
	private VeilingDAO veilingDAO;
	
	public PlaatsAction(){
		veilingDAO = new VeilingDAO();
	}
		
	public String execute(){
		//TODO: onderstaande 'tijdelijke waardes' vervangen met waardes uit sessie en nieuw gemaakt DAO's
		AccountDAO accountDAO = new AccountDAO();
		veiling.setAccount(accountDAO.getAccount(1));
		veiling.setStatus("actief");
		veiling.setBeginDatum(new Date());
		//veiling.setTitel("Oude TV");
		veiling.setRubriek(new Rubriek("TV's en Radio's", null));
		
		
		if(veilingDAO.saveVeiling(veiling)){
			return SUCCESS;
		}
		return INPUT;
	}
	
	public Veiling getModel() {
		return veiling;
	}
	
	public String submit(){
		return SUCCESS;
	}
}
