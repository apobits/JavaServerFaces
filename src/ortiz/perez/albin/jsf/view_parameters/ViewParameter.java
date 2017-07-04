/**
 * 
 */
package ortiz.perez.albin.jsf.view_parameters;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * @author Administrador
 *
 */
@Named
@ApplicationScoped
public class ViewParameter {

	private String name;

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
		this.name = name;
	}

}
