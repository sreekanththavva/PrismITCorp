/**
 * 
 */
package com.primsmitcorp.java.sreekanth.jan24th;

/**
 * @author sreekanthreddy
 *
 */
public class FibonocciSeries {
	/**
	 * I,m calculating the sum of fibonacci series
	 * 
	 * @param number
	 * @return
	 * 
	 * 		I have created a method to calculate the series
	 */
	public static long fibonacci(long number) {
		if ((number == 0) || (number == 1))
			return number;
		else
			return fibonacci(number - 1) + fibonacci(number - 2);
	}

	public static void main(String[] args) {
		/**
		 * here I'm giving num as 10 so its print only 10 values
		 */
		int num = 10;
		/**
		 * finally i'm printing the 10 values using for loop
		 */
		for (int counter = 0; counter <= num; counter++) {
			System.out.print(" " + fibonacci(counter));
		}
	}
}