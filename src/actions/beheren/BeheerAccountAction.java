package actions.beheren;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;

import dao.AccountDAO;
import dao.RechtDAO;
import domein.Account;
import domein.Recht;

public class BeheerAccountAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private AccountDAO accountDAO = new AccountDAO();
	private Account account;
	private Integer id;
	private List<Recht> rechten;
	private List<Integer> selectedRechten; 
	
	public String input(){
		//show edit form
		RechtDAO rechtDAO = new RechtDAO();
		
		rechten = rechtDAO.findAll();
		account = accountDAO.findById(id);
		
		selectedRechten = new ArrayList<Integer>();
		for(Recht recht : account.getRechten())
			selectedRechten.add(recht.getId());
		return SUCCESS;
	}
	
	public String execute(){
		//do edit
		Account updatedAccount = accountDAO.findById(getId());
		if(updatedAccount == null)
			return ERROR;		
		System.out.println(updatedAccount.getAchternaam());
		System.out.println(this.account.getAchternaam());
		updatedAccount.setAchternaam(this.account.getAchternaam());
		System.out.println(updatedAccount.getAchternaam());
		updatedAccount.setEmailadres(account.getEmailadres());
		updatedAccount.setHuisnummer(account.getHuisnummer());
		updatedAccount.setPostcode(account.getPostcode());
		updatedAccount.setStraat(account.getStraat());
		updatedAccount.setTelefoonnummer(account.getTelefoonnummer());
		updatedAccount.setTussenvoegsel(account.getTussenvoegsel());
		updatedAccount.setVoornaam(account.getVoornaam());						
		addActionMessage("Gebruiker ge-update");
		return SUCCESS;
	}
	
	public String delete(){
		//delete
		if(getId() == null || getId() == 0){
			addActionError("Geen gebruiker gespecificeerd");
			return ERROR;		
		}
		Account updatedAccount = accountDAO.findById(getId());		
		accountDAO.makeTransient(updatedAccount);
		addActionMessage("Gebruiker verwijderd");
		return SUCCESS;
	}
	
	public String saveRights(){
		Set<Recht> tempSelectedRechten = new HashSet<Recht>();
		RechtDAO rechtDAO = new RechtDAO();
		for(Integer rechtId: selectedRechten)
			tempSelectedRechten.add(rechtDAO.findById(rechtId));
		Account updatedAccount = accountDAO.findById(getId());
		if(updatedAccount == null)
			return ERROR;	
		updatedAccount.setRechten(tempSelectedRechten);
		return SUCCESS;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Recht> getRechten() {
		return rechten;
	}

	public void setRechten(List<Recht> rechten) {
		this.rechten = rechten;
	}

	public List<Integer> getSelectedRechten() {
		return selectedRechten;
	}

	public void setSelectedRechten(List<Integer> selectedRechten) {
		this.selectedRechten = selectedRechten;
	}
}
