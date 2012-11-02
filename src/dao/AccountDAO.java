package dao;
import domein.Account;

public class AccountDAO extends GenericHibernateDAO<Account, Integer> {
	
	public Account findAccount(String emailadres, String wachtwoord) {
		Account account = (Account) hSession
				.createQuery(
						"from Account where Emailadres = ? and Wachtwoord = ?")
				.setParameter(0, emailadres).setParameter(1, wachtwoord)
				.uniqueResult();
		return account;
	}
	
	public boolean emailadresExists(String emailadres){
		int count = ((Long)hSession.createQuery("select count(*) from Account where Emailadres = :emailaddr ")
				.setParameter("emailaddr", emailadres)
				.uniqueResult()	)
				.intValue();
		
		if(count > 0)
			return true;
		return false;
	}
}
