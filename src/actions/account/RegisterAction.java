package actions.account;

import domein.Account;

public class RegisterAction extends abstractSaveAccountAction{

	private static final long serialVersionUID = 1L;
	private String wachtwoordBevestiging;
	private Account account = new Account();
	
	public String getWachtwoordBevestiging() {
		return wachtwoordBevestiging;
	}

	public void setWachtwoordBevestiging(String wachtwoordBevestiging) {
		this.wachtwoordBevestiging = wachtwoordBevestiging;
	}
	
	public void validate(){
		if(accountDAO.emailadresExists(account.getEmailadres())){
			addFieldError( "emailadres", "Emailadres al in gebruik" );
		}
	}
}
