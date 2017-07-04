/**
 * 
 */
package ortiz.perez.albin.jsf.converter;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 * @author Administrador
 *
 */
@FacesConverter(value = "converter1")
public class Converter1 implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (true) {
			FacesMessage m = new FacesMessage();
			m.setSummary("lol");
			m.setSeverity(FacesMessage.SEVERITY_INFO);
			throw new ConverterException(m);
		}
		return arg2 + " Albin";
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub

		return arg2 + " Albin";
	}

}
