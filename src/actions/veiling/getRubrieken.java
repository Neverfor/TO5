package actions.veiling;


import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

import dao.RubriekDAO;
import dao.VeilingDAO;
import domein.Account;
import domein.Rubriek;

public class getRubrieken extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;	

	private RubriekDAO rubriekDAO;
	private Account account;
	private List<Rubriek> rubrieken; 

	public List<Rubriek> getRubrieken() {
		return rubrieken;
	}

	public void setVeilingen(List<Rubriek> rubrieken) {
		this.rubrieken = rubrieken;
	}

	public getRubrieken(){
		rubriekDAO = new RubriekDAO();
	}

	public String execute(){
		rubrieken = rubriekDAO.findAll();
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		account = (Account)session.get("account");

	}
}