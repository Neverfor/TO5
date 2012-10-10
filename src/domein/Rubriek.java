package domein;

import java.util.Vector;

public class Rubriek {

	public String naam;

	public Integer id;

//	/**
//	 * 
//	 * @element-type Veiling
//	 */
//	public Vector veilingen;
//	/**
//	 * 
//	 * @element-type Rubriek
//	 */
//	public Vector childeren;
	public Rubriek parent;

	public Rubriek(String naam, Rubriek parent) {
		super();
		this.naam = naam;
		this.parent = parent;
	}
	
	public Rubriek(){
		
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
//
//	public Vector getVeilingen() {
//		return veilingen;
//	}
//
//	public void setVeilingen(Vector veilingen) {
//		this.veilingen = veilingen;
//	}
//
//	public Vector getChilderen() {
//		return childeren;
//	}
//
//	public void setChilderen(Vector childeren) {
//		this.childeren = childeren;
//	}

	public Rubriek getParent() {
		return parent;
	}

	public void setParent(Rubriek parent) {
		this.parent = parent;
	}

}