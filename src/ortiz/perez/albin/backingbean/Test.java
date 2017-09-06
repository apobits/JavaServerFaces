/**
 * 
 */
package ortiz.perez.albin.backingbean;

import javax.faces.bean.ManagedBean;

/**
 * @author Administrador
 *
 */
@ManagedBean
public class Test {

	private String name;

	public String getPage() {
		return "Test2";
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
		this.name = name;
	}

}
