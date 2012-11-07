package actions.veiling;


 
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.VeilingDAO;
 
public class ImageAction extends ActionSupport implements ServletRequestAware {
 
	byte[] imageInByte = null;
	VeilingDAO veilingDAO = new VeilingDAO();
	Integer id;
 
	private HttpServletRequest servletRequest;
 
	public Integer getId() {
		return id;
	}
 
	public void setId(Integer id) {
		this.id = id;
	}
 
	public ImageAction() {
		System.out.println("ImageAction");
	}
 
	public String execute() {
		return SUCCESS;
	}
 
	public byte[] getCustomImageInBytes() {
 
		System.out.println("accountID: " + id);
 
		return veilingDAO.findById(id).getImage();
	}
 
	private File getImageFile(String imageId) {
		String filePath = servletRequest.getSession().getServletContext().getRealPath("/");
		File file = new File(filePath + "/Image/", imageId);
		System.out.println(file.toString());
		InputStream in = new ByteArrayInputStream(getCustomImageInBytes());
		try {
			BufferedImage bImageFromConvert = ImageIO.read(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}
 
	public String getCustomContentType() {
		return "image/jpeg";
	}
 
	public String getCustomContentDisposition() {
		return "anyname.jpg";
	}
 
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.servletRequest = request;
 
	}
 
}