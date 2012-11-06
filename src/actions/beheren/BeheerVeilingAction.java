package actions.beheren;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import dao.RubriekDAO;
import dao.VeilingDAO;
import domein.Rubriek;
import domein.Veiling;


public class BeheerVeilingAction extends ActionSupport implements Preparable{

	private static final long serialVersionUID = 1L;
	private VeilingDAO veilingDAO = new VeilingDAO();
	private RubriekDAO rubriekDAO = new RubriekDAO();
	private String selectedRubriek;
	private List<Rubriek> rubrieken;
	private Integer rubriek;
	private Veiling veiling = new Veiling(); 
	private Integer id;


	public String input(){
		veiling = veilingDAO.findById(id);
		selectedRubriek = veiling.getRubriek().getId().toString();
		return SUCCESS;
	}
	
	public String delete(){
		veiling = veilingDAO.findById(id);
		
		veilingDAO.makeTransient(veiling);
		addActionMessage("Veiling succesvol verwijderd");
		return SUCCESS;
	}
	
	public String execute(){
		Veiling veilingUpdated = veilingDAO.findById(id);
		veilingUpdated.setOmschrijving(veiling.getOmschrijving());
		veilingUpdated.setMinimumBod(veiling.getMinimumBod());
		veilingUpdated.setTitel(veiling.getTitel());
		veilingUpdated.setRubriek(rubriekDAO.findById(rubriek));
		veilingUpdated.setStatus(veiling.getStatus());
		if(veilingUpdated == null){
			return ERROR;
		}
		return SUCCESS;
	}


	public Veiling getVeiling() {
		return veiling;
	}


	public void setVeiling(Veiling veiling) {
		this.veiling = veiling;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public void prepare() throws Exception {
		setRubrieken(rubriekDAO.findAll());
		
	}

	public Integer getRubriek() {
		return rubriek;
	}

	public void setRubriek(Integer rubriek) {
		this.rubriek = rubriek;
	}

	public List<Rubriek> getRubrieken() {
		return rubrieken;
	}

	public void setRubrieken(List<Rubriek> rubrieken) {
		this.rubrieken = rubrieken;
	}

	public String getSelectedRubriek() {
		return selectedRubriek;
	}

	public void setSelectedRubriek(String selectedRubriek) {
		this.selectedRubriek = selectedRubriek;
	}

}
