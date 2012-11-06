package actions.beheren;

import com.opensymphony.xwork2.ActionSupport;

import dao.AccountDAO;
import domein.Account;

public class BeheerAccountAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private AccountDAO accountDAO = new AccountDAO();
	private Account account;
	private Integer id;
	
	public String input(){
		//show edit form
		account = accountDAO.findById(id);
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
}
