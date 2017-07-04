/**
 * 
 */
package ortiz.perez.albin.jsf.property_action_listener;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named("propertyActionListener")
@ApplicationScoped
/**
 * @author Administrador
 *
 */
public class PropertyActionListener {
	
	private String name;

	/**
	 * 
	 */
	public PropertyActionListener() {
		// TODO Auto-generated constructor stub
	}
	
	public void doSomething(){
		System.out.println(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
