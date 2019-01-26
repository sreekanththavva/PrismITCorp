/**
 *here i'm printing given array and then 
 *after that i'm adding one more element the array and 
 *finally I'm printing final array
 */
package com.primsmitcorp.java.sreekanth.jan24th;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sreekanthreddy
 *
 */
public class InsertAnElementIntoArray {

	private static Scanner scan;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * here i'm initializing the array
		 */
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		int array1;
		/**
		 * firstly I'm printing the given array to the output
		 */
		System.out.println("before insert" + Arrays.toString(array));
		/**
		 * Asking the output we need to add into the given array
		 */
		scan = new Scanner(System.in);
		System.out.println("enter the element you want insert ");
		int ele = scan.nextInt();
		/**
		 * finally I'm printing given and after we insert an element into the given
		 * array
		 */
		for (int check = 0; check < array.length; check++) {
			array1 = array[check];
			System.out.print(" " + array1);
		}
		System.out.println(" " + ele);

	}

}
