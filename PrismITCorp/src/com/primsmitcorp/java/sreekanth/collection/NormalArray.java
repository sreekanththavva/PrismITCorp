/**
 *  Description: I,m calculating the sum of all the elements in the array
 *  After that adding element to the array
 */
package com.primsmitcorp.java.sreekanth.collection;


/**
 * @author sreekanthreddy
 *
 */
public class NormalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declaration and implementation
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		int[] finalyarray = new int[array.length + 1];
		int add = 10;
				//Here i'm just printing the old array
		System.out.println("Before add element ");
		//printing the array using for loop
		for (int index3 = 0; index3 < array.length; index3++) {
			System.out.print(" " + array[index3]);
		}
		// System.out.println("After adding element to the arra"+finalyarray);
		// using for loop to calculate
		try {
			for (int index = 0; index < array.length; index++) {
				sum = sum + array[index];
			}
			// finally printing the value
			System.out.println();
			System.out.println("sumo of the elemnrs in array :" + sum);
			//moving all the elements in the first array  to the new array
			for (int index1 = 0; index1 < array.length; index1++) {
				finalyarray[index1] = array[index1];
			}
			//adding new element to new array in the last position
			finalyarray[finalyarray.length - 1] = add;
			//finally printing the element
			System.out.println("After Adding element to the old array");
			//Printing the elements using for loop
			for (int index2 = 0; index2 < finalyarray.length; index2++) {
				System.out.print(" " + finalyarray[index2]);
			}
		} catch (Exception e) {
			System.out.println("Something wrong with the code");

		}
	}

}
