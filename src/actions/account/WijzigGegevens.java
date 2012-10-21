package actions.account;

import java.util.Map;

import javax.persistence.Query;
import org.hibernate.*;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import domein.Account;
import dao.AccountDAO;

public class WijzigGegevens extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Account account;
	private String pcode, pass, pl, str, vnm, anm, tln, hsn, em;
	private AccountDAO accountDAO;
	private Session session;

	public String execute(){
		if (!(pass == null && pass.equals(""))){
//			Query sp = /*session.createQuery*/("update Account set wachtwoord ='"+pass+"' where id = '"+idd+"'");
			//AccountDAO.setPassword(pass, account.getId());
			account.setWachtwoord(pass);
//			accountDAO.saveAccount(account);
//			accountDAO.setPassword(pass, account.getId());
		}
		if (!(pcode == null && pcode.equals(""))){
			account.setPostcode(pcode);
//			accountDAO.getAccount(account.getId());
//			accountDAO.saveAccount(account);
		}
		if (!(pl == null && pl.equals(""))){
			account.setWoonplaats(pl);
		}
		if (!(str == null && str.equals(""))){
			account.setStraat(str);
		}
		if (!(hsn == null && hsn.equals(""))){
			account.setHuisnummer(hsn);
		}
		if (!(tln == null && tln.equals(""))){
			account.setTelefoonnummer(tln);
		}
		if (!(vnm == null && vnm.equals(""))){
			account.setVoornaam(vnm);
		}
		if (!(anm == null && anm.equals(""))){
			account.setAchternaam(anm);
		}
		if (!(em == null && em.equals(""))){
			System.out.println(account.getVoornaam());
			System.out.println(account.getEmailadres());
			account.setEmailadres(em);
			System.out.println(account.getVoornaam());
			System.out.println(account.getEmailadres());
		}
//		setAccount(account);
		return SUCCESS;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
//		session.getEntityName(account);
		this.account = account;
	}

//	@Override
	public void setSession(Map<String, Object> session) {
		account = (Account)session.get("account");
		
	}
	
	public String getEm() {
		return em;
	}

	public void setEm(String em) {
		this.em = em;
	}
	
	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPl() {
		return pl;
	}

	public void setPl(String pl) {
		this.pl = pl;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getVnm() {
		return vnm;
	}

	public void setVnm(String vnm) {
		this.vnm = vnm;
	}

	public String getAnm() {
		return anm;
	}

	public void setAnm(String anm) {
		this.anm = anm;
	}

	public String getTln() {
		return tln;
	}

	public void setTln(String tln) {
		this.tln = tln;
	}

	public String getHsn() {
		return hsn;
	}

	public void setHsn(String hsn) {
		this.hsn = hsn;
	}

}
