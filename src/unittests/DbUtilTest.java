package unittests;

import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;
import utils.DbUtil;

public class DbUtilTest {

	@Test
	public void connectionTest() {
		Connection conn = DbUtil.getConnection();
		try {
			if(!conn.isValid(10)){
				fail("Geen connectie");
			}			
			conn.close();
		} catch (SQLException e) {
			fail("SQLException " + e.toString());
		}
	}

}
