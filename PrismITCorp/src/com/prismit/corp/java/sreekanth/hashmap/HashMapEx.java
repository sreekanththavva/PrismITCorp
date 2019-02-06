/**
 * 
 */
package com.prismit.corp.java.sreekanth.hashmap;

/**
 * @author sreekanthreddy
 *
 */
public class HashMapEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EmployeEx e1 = new EmployeEx("Sreekanth", 221, 123456789);
		EmployeEx e2 = new EmployeEx("Srinadh", 222, 1255556789);
		EmployeEx e3 = new EmployeEx("Farhan", 223, 1234456789);
		EmployeEx e4 = new EmployeEx("Daya", 224, 1234564789);
		EmployeEx e5 = e1;

		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
		System.out.println(e1.equals(e5));

	}

}
