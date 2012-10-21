package domein;

import java.util.ArrayList;

public class Account {
	private String achternaam;
	private String emailadres;
	private String huisnummer;
	private int id;
	private String postcode;
	private String straat;
	private String telefoonnummer;
	private String tussenvoegsel;
	private String voornaam;
	private String wachtwoord;
	private String woonplaats;
    private ArrayList<String> roles;
    
	public Account (){}
	
	public Account(int id, String emailadres, String wachtwoord,
			String voornaam, String tussenvoegsel, String achternaam,
			String postcode, String telefoonnummer, String straat,
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
		this.straat = straat;
		this.huisnummer = huisnummer;
		this.woonplaats = woonplaats;
	}
		
	public String getAchternaam() {
		return achternaam;
	}
	public String getEmailadres() {
		return emailadres;
	}

	public String getHuisnummer() {
		return huisnummer;
	}
	public int getId() {
		return id;
	}
	public String getPostcode() {
		return postcode;
	}
	public String getStraat() {
		return straat;
	}
	public String getTelefoonnummer() {
		return telefoonnummer;
	}
	public String getTussenvoegsel() {
		return tussenvoegsel;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public String getWachtwoord() {
		return wachtwoord;
	}
	public String getWoonplaats() {
		return woonplaats;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public void setEmailadres(String emailadres) {
		this.emailadres = emailadres;
	}
	public void setHuisnummer(String huisnummer) {
		this.huisnummer = huisnummer;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public void setStraat(String straat) {
		this.straat = straat;
	}
	public void setTelefoonnummer(String telefoonnummer) {
		this.telefoonnummer = telefoonnummer;
	}
	public void setTussenvoegsel(String tussenvoegsel) {
		this.tussenvoegsel = tussenvoegsel;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}

	public ArrayList<String> getRoles() {
		return roles;
	}

	public void setRoles(ArrayList<String> roles) {
		this.roles = roles;
	}
}
