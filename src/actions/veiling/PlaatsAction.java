package actions.veiling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import dao.RubriekDAO;
import dao.VeilingDAO;
import domein.Account;
import domein.Rubriek;
import domein.Veiling;

public class PlaatsAction extends ActionSupport implements SessionAware,
		Preparable {

	private static final long serialVersionUID = 1L;
	private Veiling veiling = new Veiling();

	private RubriekDAO rubriekDAO;
	private VeilingDAO veilingDAO;
	private int veilingDuur;
	private String titel;
	private File img;
	private String omschrijving;
	private String minimumBod;
	private Integer rubriek;
	private Account account;
	private List<Rubriek> rubrieken;

	public List<Rubriek> getRubrieken() {
		return rubrieken;
	}

	public PlaatsAction() {
		rubriekDAO = new RubriekDAO();
		veilingDAO = new VeilingDAO();
	}

	public String execute(){
		if(!account.hasRecht("aanbieder")){
			addActionMessage("Niet genoeg rechten om een veiling te plaatsen");
			return LOGIN;
		}
		veiling.setAccount(account);
		veiling.setStatus("actief");
		veiling.setBeginDatum(new Date());
		veiling.setOmschrijving(omschrijving);
		veiling.setMinimumBod(Integer.parseInt(minimumBod));
		veiling.setTitel(titel);
		veiling.setRubriek(rubriekDAO.findById(rubriek));
		Calendar cal = Calendar.getInstance();
		cal.setTime(veiling.getBeginDatum());
		cal.add(Calendar.DATE, veilingDuur);
		veiling.setEindDatum(cal.getTime());
		if(img != null){
			byte[] blob = new byte[(int) img.length()];
			try {
				FileInputStream fileInputStream = new FileInputStream(img);
			     //convert file into array of bytes
			     fileInputStream.read(blob);
			     fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			veiling.setImage(blob);
		}
		veiling = veilingDAO.makePersistent(veiling);
		
		return SUCCESS;
	}

	public int getVeilingDuur() {
		return veilingDuur;
	}

	public void setVeilingDuur(int veilingDuur) {
		this.veilingDuur = veilingDuur;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public File getImg() {
		return img;
	}

	public void setImg(File img) {
		this.img = img;
	}

	public Integer getRubriek() {
		return rubriek;
	}

	public void setRubriek(Integer rubriek) {
		this.rubriek = rubriek;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public String getMinimumBod() {
		return minimumBod;
	}

	public void setMinimumBod(String minimumBod) {
		this.minimumBod = minimumBod;
	}

	public String submit() {
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		account = (Account) session.get("account");

	}

	@Override
	public void prepare() throws Exception {
		rubrieken = (List<Rubriek>) rubriekDAO.findAll();
	}
}
