package domein;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Veiling {

	private int id;
	private String titel;
	private String omschrijving;
	private Rubriek rubriek;
	private String status;
	private int minimumBod;
	private Account account;
	private Date eindDatum;
	private byte[] image;
	private Set<Bod> biedingen = new HashSet<Bod>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	
	public void addBod(Bod bod) {
		this.biedingen.add(bod);
	}
	
	public Set<Bod> getBiedingen() {
		return biedingen;
	}

	public void setBiedingen(Set<Bod> biedingen) {
		this.biedingen = biedingen;
	}
	
	public Date getEindDatum() {
		return eindDatum;
	}
	public void setEindDatum(Date eindDatum) {
		this.eindDatum = eindDatum;
	}
	private Date beginDatum;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getOmschrijving() {
		return omschrijving;
	}
	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}
	public Rubriek getRubriek() {
		return rubriek;
	}
	public void setRubriek(Rubriek rubriek) {
		this.rubriek = rubriek;
	}
	public int getMinimumBod() {
		return minimumBod;
	}
	public void setMinimumBod(int minimumBod) {
		this.minimumBod = minimumBod;
	}
	public Date getBeginDatum() {
		return beginDatum;
	}
	public void setBeginDatum(Date beginDatum) {
		this.beginDatum = beginDatum;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
}
