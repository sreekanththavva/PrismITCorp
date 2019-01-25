/**
 * 
 */
package com.primsmitcorp.java.sreekanth.jan24th;

/**
 * @author sreekanthreddy
 *
 */
public class LastElementsMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Initializing the values of two arrays
		 */
		int[] array1 = { 1, 3, 4, 5, 6, 2, 9 };
		int[] array2 = { 2, 4, 9, 2, 4, 5, 2 };
		/**
		 * I'm checking first element or last element in the array
		 */
		if (array1[0] == array2[0] || array1[array1.length - 1] == array2[array2.length - 1]) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
