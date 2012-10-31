package domein;

import java.util.Date;
import java.util.Map;

public class Bod {
	  private int id;
	  private Date datumTijd;
	  private Account account;
	  private Veiling veiling;
	  private Double geld;
	  
	  public Bod(Integer id, Date datumTijd, Account account, Veiling veiling,
			Double geld) {
//		super();
		this.id = id;
		this.datumTijd = datumTijd;
		this.account = account;
		this.veiling = veiling;
		this.geld = geld;
	}
	  
	  public Bod () {}

  
    public Integer getId() {
    	return id;
    }
    public void setId(Integer id) {
    	this.id = id;
    }

      public Double getGeld() {
    	return geld;
    }
    public void setGeld(Double geld) {
    	this.geld = geld;
    }
    public Date getDatumTijd() {
    	return datumTijd;
    }
    public void setDatumTijd(Date datumTijd) {
    	this.datumTijd = datumTijd;
    }
    public Veiling getVeiling() {
    	return veiling;
    }
    public void setVeiling(Veiling veiling) {
    	this.veiling = veiling;
    }
	  public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}