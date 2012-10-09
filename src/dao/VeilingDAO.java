package dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

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
	            session.close();
	
	        }
	
		}
	 
		public boolean saveVeiling(Veiling veiling){
			try{
				Transaction transaction = session.beginTransaction();
	            session.saveOrUpdate(veiling);
	            transaction.commit();
	            return true;
			}catch (HibernateException hibernateException) {
	            System.out.println(hibernateException.getMessage());
	            session.close();
	            return false;
	        }
		}
		
		public Veiling getVeiling(Integer id){
			return (Veiling) session.createQuery("from Veiling where id = ?").setInteger(0, id).uniqueResult();
		}
}
