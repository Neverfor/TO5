package dao;

import org.hibernate.Session;

import utils.HibernateUtil;

public class HibernateDAOFactory extends DAOFactory {

	@Override
	public AccountDAO getAccountDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VeilingDAO getVeilingDAO() {
		// TODO Auto-generated method stub
		return null;
	}
	

    private GenericHibernateDAO instantiateDAO(Class daoClass) {
        try {
            GenericHibernateDAO dao = (GenericHibernateDAO)daoClass.newInstance();
            dao.setSession(getCurrentSession());
            return dao;
        } catch (Exception ex) {
            throw new RuntimeException("Can not instantiate DAO: " + daoClass, ex);
        }
    }
 
    // You could override this if you don't want HibernateUtil for lookup
    protected Session getCurrentSession() {
        return HibernateUtil.getSessionFactory().getCurrentSession();
    }

}
