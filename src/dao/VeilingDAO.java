package dao;

import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import domein.Account;
import domein.Rubriek;
import domein.Veiling;

public class VeilingDAO {
		private Session session;
		private Transaction transaction;
		private static SessionFactory sessionFactory;
		private static ServiceRegistry serviceRegistry;
		
		public VeilingDAO(){
			try{
				Configuration configuration = new Configuration().configure();
				serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
				SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	            session = sessionFactory.openSession();            
	            System.out.println("Sessie open");
	        }catch (HibernateException hibernateException) {
	            System.out.println(hibernateException.getMessage());
	            hibernateException.printStackTrace();
	            session.close();
	        }
		}
		
		public List<Veiling> getVeilingen(Account account){
			List<Veiling> uniqueResult = (List<Veiling>) session.createQuery("from Veiling where ACCOUNT_ID = ?").setInteger(0, account.getId()).list();
			return uniqueResult;
		}
	 
		public boolean saveVeiling(Veiling veiling){
			try{
				transaction = session.beginTransaction();
	            session.saveOrUpdate(veiling);
	            transaction.commit();	            
	            return true;
			}catch (HibernateException hibernateException) {
	            System.out.println(hibernateException.getMessage());
	            transaction.rollback();
	            return false;
	        }
		}
		
		public Veiling getVeiling(Integer id){
			 Veiling veiling = (Veiling) session.createQuery("from Veiling where ID = ?").setInteger(0, id).uniqueResult();
//			 session.close();
			 return veiling;
		}
		
		public Rubriek getRubriek(Integer id){
			Rubriek rubr = (Rubriek) session.createQuery("from Rubriek where ID = ?").setInteger(0, id).uniqueResult();
			session.close();
			return rubr;
		}
		
//		public Veiling getAlleVeilingen(String status){
//			return (Veiling) session.createQuery("from Veiling where veilingstatus =?").setString(0, status);
//		}
		
		public List<Veiling> getAlleVeilingen(String status){
			List<Veiling> uniqueResult = (List<Veiling>) session.createQuery("from Veiling where VEILINGSTATUS = ?").setString(0, "actief").list();
			session.close();
			return uniqueResult;
		}
		
		public boolean deleteVeiling(Veiling veiling){
			try{
				transaction = session.beginTransaction();		
				session.delete(veiling);
				transaction.commit();
				return true;
			}catch(HibernateException hibernateException){
				System.out.println(hibernateException.getMessage());
				transaction.rollback();
	            return false;
			}	
		}
		
		public List<Veiling> zoekVeilingen(int rubriekId, String zoekTerm){
			List<Veiling> uniqueResult = (List<Veiling>) session.createQuery("from Veiling where RUBRIEK_ID = :rId AND TITEL LIKE :zTerm ").setInteger("rId", rubriekId).setString("zTerm",  "%" + zoekTerm + "%").list();
			session.close();
			return uniqueResult;
		}

		public List<Rubriek> getRubrieken(){
			List<Rubriek> uniqueResult = (List<Rubriek>) session.createQuery("from Rubriek").list();
			session.close();
			return uniqueResult;
		}
}