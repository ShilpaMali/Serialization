package com.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Seriallizable {
	public static void main(String[] args) throws IOException {

		Student student = new Student();
		student.setFirstName("aniket");
		student.setLastName("pawar");
		student.setCity("mumbai");
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try {
				// Step-1- Create object of FileOutputStream
				fos = new FileOutputStream("C:\\Users\\SHILPA\\OneDrive\\Desktop\\writetest.txt");
				// Step-2- Create object of ObjectOutputStream and pass FileOutputStream object
				oos = new ObjectOutputStream(fos);
				// Step-3- use WriteObject() method
				oos.writeObject(student);
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


