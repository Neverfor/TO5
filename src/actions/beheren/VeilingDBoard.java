package actions.beheren;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.VeilingDAO;
import domein.Veiling;

public class VeilingDBoard extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private VeilingDAO veilingDAO = new VeilingDAO();
	private List<Veiling> veilingen; 
	
	public List<Veiling> getVeilingen() {
		return veilingen;
	}

	public void setVeilingen(List<Veiling> veilingen) {
		this.veilingen = veilingen;
	}

	public String execute(){
		veilingen = (List<Veiling>) veilingDAO.findPopuleerste();
		System.out.println(veilingen);
		return SUCCESS;
	}
}
