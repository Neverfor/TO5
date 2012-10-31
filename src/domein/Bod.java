package domein;

import java.util.Date;

public class Bod {
	  private int id;
	  private Date datumTijd;
	  private Account account;
	  private Veiling veiling;
	  private double bod;
	  
  public Bod(Integer id, Date datumTijd, Account account, Veiling veiling,
			Double bod) {
		super();
		this.id = id;
		this.datumTijd = datumTijd;
		this.account = account;
		this.veiling = veiling;
		this.bod = bod;
	}

  
    public Integer getId() {
    	return id;
    }
    public void setId(Integer id) {
    	this.id = id;
    }

      public Double getBod() {
    	return bod;
    }
    public void setBod(Double bod) {
    	this.bod = bod;
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

}