/**
 * Description : I'm reverse  a string ,
 * in that first I want to convert to 
 * Array of char and then try to print each element
 */
package com.primsmitcorp.java.sreekanth.jan24th;

/**
 * @author sreekanthreddy
 *
 */
public class ReverseAString {
	/**
	 * I'm created method and try to reverse a string 
	 * @param name
	 */
	public static void reverse(String name) {
		/**
		 * Here I'm just printing before string
		 */
		System.out.println("before Reverse  :" + name);
		/**
		 * converting a string to array of char
		 */
		char[] name1 = name.toCharArray();
		System.out.println("After reverse a string");
		/**
		 * Using for loop I'm printing each letter in the string
		 */
		for (int check = name1.length - 1; check >= 0; check--) {
			char result = name1[check];
			System.out.print(result);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		reverse("sreekanth");
	}
}