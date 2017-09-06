/**
 * 
 */
package ortiz.perez.albin.jsf.named;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

import ortiz.perez.albin.jsf.enums.City;
import ortiz.perez.albin.jsf.enums.Language;
import java.io.Serializable;

/**
 * @author Administrador
 *
 */
@Named
@ApplicationScoped
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Language language;

	private String name;

	private String password;

	private City city;

	private String color;

	private boolean love;

	private int count;

	public User() {
		setCity(City.Manizales);
		setLanguage(Language.en);
		setColor("red");
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

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String startTask() {

		// JobDetail job = new JobDetailImpl();
		// job.getJobBuilder().newJob(Job1.class).withIdentity("job1",
		// "group1").build();
		//
		// try {
		// CronTrigger trigger = (CronTrigger)
		// TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
		// .withSchedule(CronScheduleBuilder.cronSchedule("15 0/2 * * *
		// ?")).forJob(job).build();
		//
		// Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
		// scheduler.scheduleJob(job, trigger);
		//
		// } catch (Exception e) {
		// System.out.println(e);
		// }

		return "greeting";
	}

	/**
	 * @return the language
	 */
	public Language getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(Language language) {
		this.language = language;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	public void changeColor() {
		System.out.println(FacesContext.getCurrentInstance().getExternalContext().getInitParameter("myName"));
		if (color.equals("red"))
			this.color = "black";
		else
			this.color = "red";
	}

	public void showLove() {
		this.love = true;
	}

	/**
	 * @return the love
	 */
	public boolean isLove() {
		return love;
	}

	/**
	 * @param love
	 *            the love to set
	 */
	public void setLove(boolean love) {
		this.love = love;
	}

	public void showLove1(ValueChangeEvent e) {
		if (e.getNewValue() == Boolean.TRUE)
			this.love = true;
		else
			this.love = false;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
		System.out.println(count);
	}

	public void send() {

	}

}
