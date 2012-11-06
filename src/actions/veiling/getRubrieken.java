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

	private Account account;
	private RubriekDAO rubriekDAO;
	private List<Rubriek> rubrieken; 

	public getRubrieken(){
		rubriekDAO = new RubriekDAO();
	}

	public String execute(){
		rubrieken = rubriekDAO.findAll();
		return SUCCESS;
	}

	public List<Rubriek> getRubrieken() {
		return rubrieken;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		account = (Account)session.get("account");

	}

	public void setVeilingen(List<Rubriek> rubrieken) {
		this.rubrieken = rubrieken;
	}
}