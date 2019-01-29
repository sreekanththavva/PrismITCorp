/**
 * 
 */
package com.primsmitcorp.java.sreekanth.collection;

import java.util.ArrayList;


/**
 * @author sreekanthreddy
 *
 */
public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declaring an implementing
		ArrayList list = null;
		// using try and catch block to control the exception
		try {
			list = new ArrayList();
			// adding all the names to the array using add
			list.add("Sreekanth");
			list.add("Srinadh");
			list.add("Prashanth");
			list.add("Ashish");
			list.add("Dinesh");
			list.add("Daya");
			list.add(123);
			// finally printing the array list
			System.out.println("Printing array after adding the elements: ");
			System.out.println(list);
			// trying to remove one name
			System.out.println("Removing one name");
			list.remove("Daya");
			System.out.println(list);
			list.add(2, "Daya");
			System.out.println(list);
			System.out.println("printing the elements usign enhanced for loop");
			for(Object element : list) {
				System.out.println(element);
			}
			java.util.Collections.sort(list);
			System.out.println(list);
		} catch (Exception e) {
			System.out.println("Something wrong with code");
		} finally {
			list.clear();
		}

	}

}
