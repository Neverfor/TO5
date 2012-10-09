package domein;

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
	private String rubriek;
	private int minimumBod;
	//private Date endDate;
	//private Date beginDate;
	//private String status;
	
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
	public String getRubriek() {
		return rubriek;
	}
	public void setRubriek(String rubriek) {
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
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}*/
}
