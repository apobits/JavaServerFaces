/**
 * 
 */
package ortiz.perez.albin.jsf.attributes;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named("attribute")
@ApplicationScoped
/**
 * @author Administrador
 *
 */
public class Attribute {

	/**
	 * 
	 */
	public Attribute() {
		// TODO Auto-generated constructor stub
	}

	public void doSomething(ActionEvent e) {
		System.out.println(e.getComponent().getAttributes().get("value"));
	}

}
