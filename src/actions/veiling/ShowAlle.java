package actions.veiling;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import dao.VeilingDAO;
import domein.Account;
import domein.Veiling;

public class ShowAlle extends ActionSupport{

	private static final long serialVersionUID = 1L;	
	
	private VeilingDAO veilingDAO;
	private List<Veiling> veilingen = new ArrayList<Veiling>(); 
	
	public List<Veiling> getVeilingen() {
		return veilingen;
	}

	public void setVeilingen(List<Veiling> veilingen) {
		this.veilingen = veilingen;
	}

	public ShowAlle(){
		veilingDAO = new VeilingDAO();
	}
		
	public String execute(){
		veilingen = (List<Veiling>) veilingDAO.findAll("actief");
		return SUCCESS;
	}
}
