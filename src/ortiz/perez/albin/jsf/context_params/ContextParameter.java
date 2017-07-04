/**
 * 
 */
package ortiz.perez.albin.jsf.context_params;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 * @author Administrador
 *
 */
@Named
@ApplicationScoped
public class ContextParameter {

	private String x;

	/**
	 * @return the x
	 */
	public String getX() {
		UIViewRoot uvr = FacesContext.getCurrentInstance().getViewRoot();
		((UIInput)uvr.findComponent("")).getAttributes();
		System.out.println(FacesContext.getCurrentInstance().getExternalContext().getInitParameter("myName"));
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(String x) {
		this.x = x;
	}

}
