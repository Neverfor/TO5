package actions.veiling;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.BodDAO;
import domein.Account;
import domein.Veiling;
import domein.Bod;
import dao.VeilingDAO;


public class BiedAction extends ActionSupport implements ModelDriven<Bod>, SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2534446146222716771L;
	private Bod bod = new Bod();
	private BodDAO bodDAO;
	private Double geld;
	private int veilingId;
	private Date datum;
	private Veiling veiling;
	private VeilingDAO veilingDAO = new VeilingDAO();
	private Account account;

	public BiedAction(){
		bodDAO = new BodDAO();
	}

	public String execute() {
		if (geld ==  null){
			geld = 1000.00;
		}
		Date datumTijd = new Date();
		System.out.println(geld);
		bod.setAccount(account);
		bod.setGeld(geld);
		bod.setDatumTijd(datumTijd);
		veiling = (Veiling) veilingDAO.getVeiling(veilingId);
		bod.setVeiling(veiling);
		System.out.println(veiling.getTitel());
		if(bodDAO.saveBod(bod)){
			return SUCCESS;
		}
		return INPUT;
	}	
	
//	public void validate(){
////		if(bodDAO.emailadresExists(account.getEmailadres())){
////			addFieldError( "emailadres", "Emailadres al in gebruik" );
////		}
//	}
	
	public Double getGeld() {
		return geld;
	}

	public void setGeld(Double geld) {
		this.geld = geld;
	}
	
	public Bod getModel() {
		return bod;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}
	

	public Veiling getVeiling() {
		return veiling;
	}
	
	public void setVeiling(Veiling veiling) {
		this.veiling = veiling;
	}
	
	public int getVeilingId() {
		return veilingId;
	}

	public void setVeilingId(int veilingId) {
		this.veilingId = veilingId;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		account = (Account)session.get("account");
	}

}
