package domein;

public class Account {
	private int id;
	private String emailadres;
	private String wachtwoord;
	private String voornaam;
	private String tussenvoegsel;
	private String achternaam;
	private String postcode;
	private String telefoonnummer;
	private String credits;
	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}
	private String straat;
	private String huisnummer;
	private String woonplaats;
	
	public Account(int id, String emailadres, String wachtwoord,
			String voornaam, String tussenvoegsel, String achternaam,
			String postcode, String telefoonnummer, String credits, String straat,
			String huisnummer, String woonplaats) {
		super();
		this.id = id;
		this.emailadres = emailadres;
		this.wachtwoord = wachtwoord;
		this.voornaam = voornaam;
		this.tussenvoegsel = tussenvoegsel;
		this.achternaam = achternaam;
		this.postcode = postcode;
		this.telefoonnummer = telefoonnummer;
		this.credits = credits;
		this.straat = straat;
		this.huisnummer = huisnummer;
		this.woonplaats = woonplaats;
	}
	
	public Account (){}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public String getEmailadres() {
		return emailadres;
	}
	public void setEmailadres(String emailadres) {
		this.emailadres = emailadres;
	}
	public String getWachtwoord() {
		return wachtwoord;
	}
	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getTussenvoegsel() {
		return tussenvoegsel;
	}
	public void setTussenvoegsel(String tussenvoegsel) {
		this.tussenvoegsel = tussenvoegsel;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getTelefoonnummer() {
		return telefoonnummer;
	}
	public void setTelefoonnummer(String telefoonnummer) {
		this.telefoonnummer = telefoonnummer;
	}
	public String getStraat() {
		return straat;
	}
	public void setStraat(String straat) {
		this.straat = straat;
	}
	public String getHuisnummer() {
		return huisnummer;
	}
	public void setHuisnummer(String huisnummer) {
		this.huisnummer = huisnummer;
	}
	public String getWoonplaats() {
		return woonplaats;
	}
	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}
	
	
	
}
