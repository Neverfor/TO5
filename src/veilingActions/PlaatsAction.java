package veilingActions;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.VeilingDAO;
import domein.Veiling;

public class PlaatsAction extends ActionSupport implements ModelDriven<Veiling> {

	private static final long serialVersionUID = 1L;
	private Veiling veiling;
	
	private VeilingDAO veilingDAO;
	
	public PlaatsAction(){
		veilingDAO = new VeilingDAO();
	}
		
	public String execute(){
		if(veilingDAO.saveVeiling(veiling)){
			return SUCCESS;
		}
		return INPUT;
	}
	
	public Veiling getModel() {
		return veiling;
	}
	
	public String submit(){
		return SUCCESS;
	}
}
