package domein;

import java.util.Date;


public class Veiling {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String titel;
	private String omschrijving;
	private Rubriek rubriek;
	private String status;
	
	private int minimumBod;
	private Account account;
	private Date einddatum;
	public Date getEindDatum() {
		return einddatum;
	}
	public void setEindDatum(Date einddatum) {
		this.einddatum = einddatum;
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
	/*public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	*/
	
	public Date getBeginDatum() {
		return beginDatum;
	}
	public void setBeginDatum(Date beginDatum) {
		this.beginDatum = beginDatum;
	}
	
	/*
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}*/
}
