package actions.veiling;

 
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import actions.veiling.ImageAction;
 
public class CustomImageResult implements Result {
 
	public void execute(ActionInvocation invocation) throws Exception {
 
		ImageAction action = (ImageAction) invocation.getAction();
		HttpServletResponse response = ServletActionContext.getResponse();
 
		response.setContentType(action.getCustomContentType());
		response.getOutputStream().write(action.getCustomImageInBytes());
		response.getOutputStream().flush();
 
	}
 
}