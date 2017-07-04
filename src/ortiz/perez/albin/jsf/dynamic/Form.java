/**
 * 
 */
package ortiz.perez.albin.jsf.dynamic;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.component.behavior.ClientBehaviorBase;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import javax.inject.Named;

/**
 * @author Administrador
 *
 */
@Named("form")
@ApplicationScoped
public class Form extends ClientBehaviorBase implements ValueChangeListener {

	private HtmlInputText input;

	private HtmlInputText input1;

	private String name;

	private String lastName;

	private String surName;

	/**
	 * @return the input
	 */
	public HtmlInputText getInput() {
		input = new HtmlInputText();
		input.setId("input");
		input.setValue("Hello...");
		// input.addClientBehavior("click", this);
		input.setOnchange("disable()");
		// input.addValueChangeListener(this);
		return input;
	}

	/**
	 * @param input
	 *            the input to set
	 */
	public void setInput(HtmlInputText input) {
		this.input = input;
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

	public void doSomething() {
		System.out.println();
	}

	public void updateComponent() {
		FacesContext.getCurrentInstance().getExternalContext();
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the surName
	 */
	public String getSurName() {
		return surName;
	}

	/**
	 * @param surName
	 *            the surName to set
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}

	/**
	 * @return the input1
	 */
	public HtmlInputText getInput1() {
		input1 = new HtmlInputText();
		input1.setId("input1");
		return input1;
	}

	/**
	 * @param input1
	 *            the input1 to set
	 */
	public void setInput1(HtmlInputText input1) {
		this.input1 = input1;
	}

	@Override
	public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
		// TODO Auto-generated method stub
		if (event.getNewValue().equals("Albin")) {
			input1.setDisabled(true);
		}
	}

	public String getRendererType() {
		input1.setDisabled(true);
		return "input1";
	}

}
