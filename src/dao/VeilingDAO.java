package dao;

import java.util.List;
import domein.Account;
import domein.Bod;
import domein.Rubriek;
import domein.Veiling;

public class VeilingDAO extends GenericHibernateDAO<Veiling, Integer> {
		
		public List<Veiling> findAllFromAccount(Account account){
			@SuppressWarnings("unchecked")
			List<Veiling> uniqueResult = (List<Veiling>) hSession.createQuery("from Veiling where ACCOUNT_ID = ?")
					.setInteger(0, account.getId()).list();
			return uniqueResult;
		}
		public List<Veiling> findAll(String status){
			@SuppressWarnings("unchecked")
			List<Veiling> uniqueResult = (List<Veiling>) hSession.createQuery("from Veiling where VEILINGSTATUS = ?")
					.setString(0, status).list();
			return uniqueResult;
		}	
		
		public List<Veiling> zoekVeilingen(int rubriekId, String zoekTerm){
			if(zoekTerm == null) zoekTerm = "";
			List<Veiling> uniqueResult = (List<Veiling>) hSession.createQuery("from Veiling where RUBRIEK_ID = :rId AND TITEL LIKE :zTerm ").setInteger("rId", rubriekId).setString("zTerm",  "%" + zoekTerm + "%").list();
			return uniqueResult;
		}
		
		public List<Veiling> zoekVeilingen(String zoekTerm){
			if(zoekTerm == null) zoekTerm = "";
			List<Veiling> uniqueResult = (List<Veiling>) hSession.createQuery("from Veiling where TITEL LIKE :zTerm ").setString("zTerm",  "%" + zoekTerm + "%").list();
			return uniqueResult;
		}
		public void addImage(Veiling veiling, byte[] blob) {
			
		}
		
		public Bod getLastBod(int veilingID){
			Bod uniqueResult = (Bod) hSession.createQuery("from Bod where rownum=1 AND VEILING_ID = ? order by GELD desc")
					.setInteger(0, veilingID).setMaxResults(1).uniqueResult();
			return uniqueResult;
		}	
}
