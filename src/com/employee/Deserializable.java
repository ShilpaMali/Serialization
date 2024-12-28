package com.employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializable {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			// Step-1- Create Object of FileInputStream
			fis = new FileInputStream("C:\\Users\\Jeevan\\Desktop\\writetest.txt");
			// Step-2- Create object of ObjectInputStream and pass FileInputSteam Object
			ois = new ObjectInputStream(fis);
			// Step-3- readObject() method
			Object obj = ois.readObject();
			// Step-4- use type casting
			Employee emp = (Employee) obj;
			// Step-5- get the data from emp object
			// String fName = emp.getFirstName();
			// System.out.println("FirstName>>" + fName);
			System.out.println("FirstName>>" + emp.getFirstName());
			System.out.println("Last Name>>" + emp.getLastName());
			System.out.println("City>>" + emp.getCity());

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			fis.close();
			ois.close();
		}
	}

}
