package com.employee;
import java.io.Serializable;

public class Employee implements Serializable {
private static final long serialVersionUID = 1L;
	
	private String firstName; //amit
	private String lastName; //deshmukh
	private String city; //pune

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) { //amit
		this.firstName = firstName;
		//amit value will be assigned to firstName variable
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) { //deshmukh
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) { //pune
		this.city = city; //pune
	}


}
