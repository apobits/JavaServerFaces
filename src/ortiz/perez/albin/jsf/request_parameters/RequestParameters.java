/**
 * 
 */
package ortiz.perez.albin.jsf.request_parameters;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@ApplicationScoped
public class RequestParameters {

	private String name;

	public void execute() {
		System.out.println(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("name"));
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		System.out.println(name);
		this.name = name;
	}

}
