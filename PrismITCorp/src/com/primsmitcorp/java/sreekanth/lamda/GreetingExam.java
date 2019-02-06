/**
 * 
 */
package com.primsmitcorp.java.sreekanth.lamda;

/**
 * @author sreekanthreddy
 *
 */
public class GreetingExam {

	/**
	 * @param args
	 */
	static String naming = "hello";

	public static void main(String[] args) {

		GreetingExample grt = name -> System.out.println(naming + name);

		grt.greet(" Sreekanth");
	}

	interface GreetingExample {
		void greet(String name);
	}
}
