/**
 * 
 */
package com.primsmitcorp.java.sreekanth.lamda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sreekanthreddy
 *
 */
public class FuncEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Functional Interface");
		System.out.println("======================");
		IFunctionalEx ex = name -> System.out.println(name);
		;
		ex.firstWork("sreekanth");
		System.out.println("======================");
		System.out.println("Using Stream printing arraylist after sorted and covert to uppercase letters ");
		System.out.println("================================");

		List<String> list = new ArrayList<>();
		list.add("Sreenu");
		list.add("Sreekanth");
		list.add("Srinadh");
		list.add("Venkat");
		list.add("Dinesh");
		list.add("Daya");
		System.out.println("before sort and convert");
		System.out.println("======================");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("======================");
		list.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("===========================");


	}

}
