/**
 * 
 */
package com.primsmitcorp.java.sreekanth.lamda;

import java.util.Comparator;

/**
 * @author sreekanthreddy
 *
 */
public class LamdaExm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Comparator<String> lambdaEx = (string1, string2) -> string1.compareTo(string2);
		int compare = lambdaEx.compare("Hello", "Hello");
		System.out.println(compare);
	}

}
