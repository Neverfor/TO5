package dao;

import java.util.Date;
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
import domein.Veiling;
import domein.Bod;

public class BodDAO {
		private Session session;
		private Transaction transaction;
		private static SessionFactory sessionFactory;
		private static ServiceRegistry serviceRegistry;
		
		public BodDAO(){
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
		
		public List<Bod> getVeilingen(Account account){
			List<Bod> uniqueResult = (List<Bod>) session.createQuery("from Bod where ACCOUNT_ID = ?").setInteger(0, account.getId()).list();
			session.close();
			return uniqueResult;
		}
	 
		public boolean saveBod(Bod bod){
			try{
				transaction = session.beginTransaction();
	            session.saveOrUpdate(bod);
	            transaction.commit();	            
	            return true;
			}catch (HibernateException hibernateException) {
	            System.out.println(hibernateException.getMessage());
	            transaction.rollback();
	            return false;
	        }
		}
		
		public Bod getBod(Integer id){
			Bod bod = (Bod) session.createQuery("from Veiling where ID = ?").setInteger(0, id).uniqueResult();
			session.close();
			return bod;
		}
		
//		public Veiling getAlleVeilingen(String status){
//			return (Veiling) session.createQuery("from Veiling where veilingstatus =?").setString(0, status);
//		}
		
		public List<Bod> getAlleBoden(Date datum){
			List<Bod> uniqueResult = (List<Bod>) session.createQuery("from Veiling where VEILINGSTATUS = ?").setString(0, "actief").list();
			return uniqueResult;
		}
		

}