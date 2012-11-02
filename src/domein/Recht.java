package domein;

public class Recht {
	private Integer id;
	private String beschrijving;
	
	public Recht(String beschrijving){
		this.beschrijving = beschrijving;
	}
	
	public Recht(){
		
	}

	public String getBeschrijving() {
		return beschrijving;
	}

	public void setBeschrijving(String beschrijving) {
		this.beschrijving = beschrijving;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Recht)
			if (((Recht) o).beschrijving.equals(beschrijving))
				return true;
		return false;
	}

	@Override
	public int hashCode() {
		return beschrijving.hashCode();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
