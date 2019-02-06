/**
 * 
 */
package com.primsmitcorp.java.sreekanth.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author sreekanthreddy
 *
 */
public class CallEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("Sreekanth", 500, 150000, 22));
		list.add(new Employee("Farhan", 504, 120000, 20));
		list.add(new Employee("Srinadh", 503, 100000, 25));
		list.add(new Employee("Dinesh", 730, 45000, 28));

		list.stream().forEach(System.out::println);
		
		

	}

}
