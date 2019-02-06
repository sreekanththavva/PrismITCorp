/**
 * 
 */
package com.primsmitcorp.java.sreekanth.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author sreekanthreddy
 *
 */
public class SerializationExamp {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Employee employee = new Employee();
		employee.name = "Sreekanth";
		employee.id = 100;
		employee.ssn = 123 - 23 - 1234;
		employee.address = "Hyd";

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"//Users//sreekanthreddy//git//PrismITCorp//PrismITCorp//Sample.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(employee);
			System.out.println(employee.address);
			System.out.println(employee.ssn);
			System.out.println(employee.id);
			System.out.println(employee.name);
			objectOutputStream.close();
			fileOutputStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
