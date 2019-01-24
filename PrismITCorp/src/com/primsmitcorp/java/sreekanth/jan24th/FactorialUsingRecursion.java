/**
 * 
 */
package com.primsmitcorp.java.sreekanth.jan24th;

/**
 * @author sreekanthreddy
 *
 */
public class FactorialUsingRecursion {
	/**
	 * Creating method to calculating the factorial
	 * @param num
	 * @return
	 */

	public static long factorial(long num) {
		if (num == 1)
			return 1;
		else
			return num * factorial(num - 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(factorial(5));

	}

}
