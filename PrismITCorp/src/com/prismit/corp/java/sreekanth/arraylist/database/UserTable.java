/**
 * 
 */
package com.prismit.corp.java.sreekanth.arraylist.database;

import java.io.Serializable;

/**
 * @author sreekanthreddy
 *
 */
public class UserTable  implements Serializable {
	public String firstName;
	public String lastName;

	public String getFirst_name() {
		return this.firstName;
	}

	public void setFirst_name(String first_name) {
		this.firstName = first_name;
	}

	public String getLast_name() {
		return this.lastName;
	}

	public void setLast_name(String last_name) {
		this.lastName = last_name;
	}
	
	public String toString() {
		return "First Name [ "+this.firstName+" ] Last Name [" + this.lastName +"]";
	}

}
