package actions.veiling;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.*;

import utils.HibernateUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.BodDAO;
import domein.Account;
import domein.Veiling;
import domein.Bod;
import dao.VeilingDAO;
import dao.AccountDAO;

public class BiedAction extends ActionSupport implements
/* ModelDriven<Bod>, */SessionAware {
	private static final long serialVersionUID = -2534446146222716771L;
	private Bod bod = new Bod();
	private BodDAO bodDAO;
	private Double gelds, geld;
	private int veilingId;
	private Date datum;
	private Veiling veiling;
	private VeilingDAO veilingDAO = new VeilingDAO();
	private AccountDAO accountDAO = new AccountDAO();
	private AccountDAO accountDAO2 = new AccountDAO();
	private Account account;
	private Bod huidigeBod;

	public BiedAction() {
		bodDAO = new BodDAO();
	}

	public String execute() {
		veiling = (Veiling) veilingDAO.findById(veilingId);
		if (!account.hasRecht("bieder")) {
			addActionMessage("Niet genoeg rechten om een veiling te plaatsen");
			return LOGIN;
		}
		if (account.getId() == veiling.getAccount().getId()) {
			addActionMessage("Je kan niet bieden op eigen veiling!");
			return LOGIN;
		}
		if (huidigeBod != null) {
			huidigeBod = veilingDAO.getLastBod(veilingId);
			int id = account.getId();
			Account acc = (Account) accountDAO.findById(id);
			Date dT = new Date();
			bod.setAccount(acc);
			bod.setGeld(gelds);
			bod.setDatumTijd(dT);
			veiling = (Veiling) veilingDAO.findById(veilingId);
			bod.setVeiling(veiling);
			veiling.addBod(bod);
			double nCredits = account.getCredits() - gelds;
			account.setCredits(nCredits);
			
			int vid = huidigeBod.getAccount().getId();
			Account vorigeBieder = accountDAO.findById(vid);
			double terugCredits = vorigeBieder.getCredits() + huidigeBod.getGeld();
			vorigeBieder.setCredits(terugCredits);
//			accountDAO.makePersistent(account);
			accountDAO.makePersistentMerge(account);
//			HibernateUtil.getCurrentSession.flush();
			accountDAO.makePersistent(vorigeBieder);
//			accountDAO2.makePersistentMerge(vorigeBieder);
			return SUCCESS;
			
		} 
		if (huidigeBod==null) {
			int id = account.getId();
			Account acc = (Account) accountDAO.findById(id);
			Date dT = new Date();
			bod.setAccount(acc);
			bod.setGeld(gelds);
			bod.setDatumTijd(dT);
			veiling = (Veiling) veilingDAO.findById(veilingId);
			bod.setVeiling(veiling);
			veiling.addBod(bod);
			double nCredits = account.getCredits() - gelds;
			account.setCredits(nCredits);
			accountDAO.makePersistent(account);
			return SUCCESS;
		}
		else {
			return INPUT;
		}

	}

	public void validate() {
		int id = account.getId();
		int vid = 1;
//		Account acc = (Account) accountDAO.findById(id);
		veiling = (Veiling) veilingDAO.findById(veilingId);
		huidigeBod = veilingDAO.getLastBod(veilingId);
//		System.out.println("/nabc " + huidigeBod.getGeld());
		if (huidigeBod!=null){
			vid = huidigeBod.getAccount().getId();
		}
		Account vorigeBieder = accountDAO.findById(vid);
//		System.out.println("/nBlabla" + vorigeBieder.getId());
		
		if(id==vorigeBieder.getId()){
			addActionError("Je bent al de hoogste bieder!");
		}
		if (gelds == null) {
			addFieldError("geld", "Geld veld mag niet leeg zijn!");
		}
		if (huidigeBod != null) {
			if (huidigeBod.getGeld() >= gelds) {
				addFieldError("geld",
						"Bod mag niet lager of gelijk aan de huidige bod zijn!");
			}
		}
		if (huidigeBod == null) {
			if (veiling.getMinimumBod() >= gelds) {
				addFieldError("geld",
						"Bod mag niet lager of gelijk aan de huidige bod zijn!");
			}
		}
		if (veiling.getMinimumBod() >= gelds) {
			addFieldError("geld",
					"Bod mag niet lager of gelijk aan de huidige bod zijn!");
		}
		if (account.getCredits() < gelds) {
			addFieldError("geld", "Je hebt niet genoeg geld op je rekening =(");
		}
	}

	public Double getGeld() {
		return geld;
	}

	public void setGeld(Double gelds) {
		this.geld = gelds;
	}

	public Double getGelds() {
		return gelds;
	}

	public void setGelds(Double gelds) {
		this.gelds = gelds;
	}

	/*
	 * public Bod getModel() { return bod; }
	 */

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
		account = (Account) session.get("account");
	}
}
