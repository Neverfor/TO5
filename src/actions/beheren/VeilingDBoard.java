package actions.beheren;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.VeilingDAO;
import domein.Veiling;

public class VeilingDBoard extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private VeilingDAO veilingDAO = new VeilingDAO();
	private List<Veiling> veilingenP = new ArrayList<Veiling>(); 
	
	public List<Veiling> getVeilingenP() {
		return veilingenP;
	}

	public void setVeilingenP(List<Veiling> veilingen) {
		this.veilingenP = veilingen;
	}

	public String execute(){
		veilingenP = (List<Veiling>) veilingDAO.findPopuleerte();
		return SUCCESS;
	}
}
