package actions.beheren;

import com.opensymphony.xwork2.ActionSupport;

import dao.VeilingDAO;
import domein.Veiling;

public class BeheerVeilingAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private VeilingDAO veilingDAO = new VeilingDAO();
	private Veiling veiling; 
	private Integer id;


	public String input(){
		veiling = veilingDAO.findById(id);
		return SUCCESS;
	}
	
	public String delete(){
		veiling = veilingDAO.findById(id);
		veilingDAO.makeTransient(veiling);
		return SUCCESS;
	}
	
	public String execute(){
		Veiling veilingUpdated = veilingDAO.findById(id);
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

}
