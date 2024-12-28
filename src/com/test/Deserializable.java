package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializable {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			// Step-1- Create Object of FileInputStream
			fis = new FileInputStream("C:\\Users\\SHILPA\\OneDrive\\Desktop\\writetest.txt");
			// Step-2- Create object of ObjectInputStream and pass FileInputSteam Object
			ois = new ObjectInputStream(fis);
			// Step-3- readObject() method
			Object obj = ois.readObject();
			// Step-4- use type casting
			Student stud = (Student) obj;
			// Step-5- get the data from stud object
			// String fName = stud.getFirstName();
			// System.out.println("FirstName>>" + fName);
			System.out.println("FirstName>>" + stud.getFirstName());
			System.out.println("Last Name>>" + stud.getLastName());
			System.out.println("City>>" + stud.getCity());

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			fis.close();
			ois.close();
		}
	}

}
