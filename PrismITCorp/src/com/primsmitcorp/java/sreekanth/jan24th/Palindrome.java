/**
 * Description:  I'm checking number whether the number is plaindrome or not
 */
package com.primsmitcorp.java.sreekanth.jan24th;

/**
 * @author sreekanthreddy
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * I'm Initializing the values. num-->this is the number to check. temo-->i'm
		 * saving num in to temp so that we don't need to change anything sum--> this is
		 * like i'm storing value to compare with temp rem is calculating the remainder
		 * value
		 */
		int num = 198;
		int temp = num;
		int sum = 0;
		int rem;
		/**
		 * here I'm using while loop
		 */
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		/**
		 * if condition I'm comparing
		 */
		if (temp == sum) {
			System.out.println(" palindrome");
		} else {
			System.out.println("not Palindrome");
		}

	}

}
