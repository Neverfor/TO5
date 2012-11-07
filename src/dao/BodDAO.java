package dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
//import org.hibernate.hSession;
//import org.hibernate.hSessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import domein.Account;
import domein.Veiling;
import domein.Bod;

public class BodDAO extends GenericHibernateDAO<Bod, Integer> {
	// private hSession hSession;
	// private Transaction transaction;
	// private static hSessionFactory hSessionFactory;
	// private static ServiceRegistry serviceRegistry;
	//
	// public BodDAO(){
	// try{
	// Configuration configuration = new Configuration().configure();
	// serviceRegistry = new
	// ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
	// hhSessionFactory hhSessionFactory =
	// configuration.buildhhSessionFactory(serviceRegistry);
	// hhSession = hhSessionFactory.openhhSession();
	// System.out.println("Sessie open");
	// }catch (HibernateException hibernateException) {
	// System.out.println("Er is een fout opgetreden!");
	// System.out.println(hibernateException.getMessage());
	// hibernateException.printStackTrace();
	// hhSession.close();
	// }
	// }

	public List<Bod> getBiedingen(Account account) {
		List<Bod> uniqueResult = (List<Bod>) hSession
				.createQuery("from Bod where ACCOUNT_ID = ?")
				.setInteger(0, account.getId()).list();
		hSession.close();
		return uniqueResult;
	}

//	public boolean saveBod(Bod bod) {
//		try {
////			transaction = hSession.beginTransaction();
//			hSession.saveOrUpdate(bod);
////			transaction.commit();
//			return true;
//		} catch (HibernateException hibernateException) {
//			System.out.println("Bij toevoegen van bod ging iets mis!");
//			System.out.println(hibernateException.getMessage());
////			transaction.rollback();
//			return false;
//		}
//	}

	public Bod getBod(Integer id) {
		Bod bod = (Bod) hSession.createQuery("from Veiling where ID = ?")
				.setInteger(0, id).uniqueResult();
		// hSession.close();
		return bod;
	}

	public List<Bod> getVeilingen(Account account) {
		List<Bod> uniqueResult = (List<Bod>) hSession
				.createQuery("from Bod where ACCOUNT_ID = ?")
				.setInteger(0, account.getId()).list();
		hSession.close();
		return uniqueResult;
	}

	public Veiling getAlleBiedingen() {
		return (Veiling) hSession.createQuery("from Bod");
	}

	public List<Bod> getBiedingenByID(int id) {
		List<Bod> uniqueResult = (List<Bod>) hSession
				.createQuery("from BOD where VEILING_ID = ?").setInteger(0, id)
				.list();
		return uniqueResult;
	}

}