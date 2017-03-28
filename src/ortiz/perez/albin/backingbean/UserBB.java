/**
 * 
 */
package ortiz.perez.albin.backingbean;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIInput;

/**
 * @author Administrador
 *
 */
@ManagedBean
public class UserBB {

	private UIInput user;

	private UIInput password;

	/**
	 * @return the user
	 */
	public UIInput getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(UIInput user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public UIInput getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(UIInput password) {
		this.password = password;
	}

	/**
	 * @return the login
	 */
	public String login() {
		return "Welcome.xhtml";
	}

}
