/**
 * 
 */
package ortiz.perez.albin.listener;

import javax.servlet.http.HttpSessionEvent;

/**
 * @author Administrador
 *
 */
public class HttpSessionListener implements javax.servlet.http.HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("Session created with id " + event.getSession().getId());

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("Session destroyed with id " + event.getSession().getId());

	}

}
