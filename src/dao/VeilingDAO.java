package dao;

import java.util.List;
import domein.Account;
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
			List<Veiling> uniqueResult = (List<Veiling>) hSession.createQuery("from Veiling where RUBRIEK_ID = :rId AND TITEL LIKE :zTerm ").setInteger("rId", rubriekId).setString("zTerm",  "%" + zoekTerm + "%").list();
			hSession.close();
			return uniqueResult;
		}
		
		public List<Veiling> zoekVeilingen(String zoekTerm){
			List<Veiling> uniqueResult = (List<Veiling>) hSession.createQuery("from Veiling where TITEL LIKE :zTerm ").setString("zTerm",  "%" + zoekTerm + "%").list();
			hSession.close();
			return uniqueResult;
		}
}
