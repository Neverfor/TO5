package domein;

import java.util.Date;

public class Bod {

  private Integer id;

  public Double bod;

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
public Date datumTijd;

    public Account account;
    public Veiling veiling;

}