/**
 * 
 */
package ortiz.perez.albin.jsf.flash_scope;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("flashScope")
@RequestScoped
/**
 * @author Administrador
 *
 */
public class FlashScope {

	/**
	 * 
	 */
	public FlashScope() {
		// TODO Auto-generated constructor stub
	}

	public void getFlashParam() {
		System.out.println(FacesContext.getCurrentInstance().getExternalContext().getFlash().get("name"));
	}

	public String setFlashParam() {
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("name", "danna");
		return "FlashScope2";
	}

}
