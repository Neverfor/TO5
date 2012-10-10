package unittests;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dao.AccountDAO;
import dao.VeilingDAO;
import domein.Rubriek;
import domein.Veiling;

public class VeilingDAOTest  {
	private static VeilingDAO veilingDAO;
	private static AccountDAO accountDAO;
	private Veiling tvVeiling;
	private Veiling radioVeiling;
	private Rubriek rubriek = new Rubriek("TV's en Radio's", null);
	
	@BeforeClass
	public static void setUpBeforeClass(){
		veilingDAO = new VeilingDAO();
		accountDAO = new AccountDAO();
		
	}
	
	@Before
	public void setUp(){		
		//maak nieuwe veiling en sla op in DB
		tvVeiling = new Veiling();
		tvVeiling.setMinimumBod(10);
		tvVeiling.setOmschrijving("Een goed werkende oude TV, zo op te halen!");
		tvVeiling.setRubriek(rubriek);
		tvVeiling.setAccount(accountDAO.getAccount(1));
		tvVeiling.setStatus("actief");
		tvVeiling.setBeginDatum(new Date());
		tvVeiling.setTitel("Oude TV");
		//sla op
		veilingDAO.saveVeiling(tvVeiling);
		
		//maak nieuwe onopgeslage veiling
		radioVeiling = new Veiling();
		radioVeiling.setMinimumBod(70);
		radioVeiling.setOmschrijving("Bijna nieuwe radio, heel weinig gebruikt");
		radioVeiling.setRubriek(rubriek);
		radioVeiling.setAccount(accountDAO.getAccount(1));
		radioVeiling.setStatus("actief");
		radioVeiling.setBeginDatum(new Date());
		radioVeiling.setTitel("Bijna nieuwe radio");
		
	}
	
	@After
	public void tearDown(){
		veilingDAO.deleteVeiling(tvVeiling);
		veilingDAO.deleteVeiling(radioVeiling);
	}
	
	@AfterClass
	public static void tearDownAfterClass(){
		
	}

	@Test
	public void testSaveVeiling() {
		veilingDAO.saveVeiling(radioVeiling);
		Veiling testRadioVeiling = veilingDAO.getVeiling(radioVeiling.getId());
		assertEquals(radioVeiling, testRadioVeiling);
	}
	
	@Test
	public void testGetVeilingen(){
		List<Veiling> veilingen = veilingDAO.getVeilingen(accountDAO.getAccount(1));
		if(veilingen.isEmpty()){
			fail("Dit account hoort 1 veiling te hebben");
		}
	}

}
