package com.employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable {
	public static void main(String[] args) throws IOException {

		// How to set/store value into employee object
		Employee employee = new Employee();
		employee.setFirstName("amit");
		employee.setLastName("deshmukh");
		employee.setCity("pune");
		//employee- amit deshmukh pune
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			// Step-1- Create object of FileOutputStream
			fos = new FileOutputStream("C:\\Users\\Jeevan\\Desktop\\writetest.txt");
			// Step-2- Create object of ObjectOutputStream and pass FileOutputStream object
			oos = new ObjectOutputStream(fos);
			// Step-3- use WriteObject() method
			oos.writeObject(employee);
			// Step-4- Meaningful message
			System.out.println("Serialization is done successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			fos.close();
			oos.close();
		}
	}

}
