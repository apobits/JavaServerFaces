package ortiz.perez.albin.jsf.util;

import java.util.ArrayList;
import java.util.List;

public class Family {

	private List<String> members;

	public Family() {
		members = new ArrayList<>();
		members.add("Danna Perez Castro");
		members.add("Lina Marcela Castro");
		members.add("Albin Perez Ortiz");
	}

	/**
	 * @return the members
	 */
	public List<String> getMembers() {
		return members;
	}

	/**
	 * @param members
	 *            the members to set
	 */
	public void setMembers(List<String> members) {
		this.members = members;
	}
	
	public static List<String> getFamily(){
		List<String> temp = new ArrayList<>();
		temp.add("AA");
		temp.add("BB");
		return temp;
	}

}
