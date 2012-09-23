package utils;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

public class DbUtil {
	private static PoolDataSource  pds;
	
	  static {
          System.out.println("OracleDataSource Initialization");
          try {
        	  pds = PoolDataSourceFactory.getPoolDataSource();
        	  pds.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
        	  pds.setURL("jdbc:oracle:thin:@ondora01.hu.nl:8521:cursus01");
        	  pds.setUser("THO5_2012_2A_TEAM3");
        	  pds.setPassword("THO5_2012_2A_TEAM3");
        	  pds.setInitialPoolSize(5);        	          	
          }
          catch (SQLException e) {
              e.printStackTrace();
          }
      }
	  
	  public static Connection getConnection(){
		  try {
			return pds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	  }
}
