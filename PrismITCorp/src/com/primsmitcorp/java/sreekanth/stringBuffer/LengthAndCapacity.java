/**
 * 
 */
package com.primsmitcorp.java.sreekanth.stringBuffer;

/**
 * @author sreekanthreddy
 *
 */
public class LengthAndCapacity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Declaring and Initializing
		 */

		StringBuffer stringBuffer = new StringBuffer("find the length and capacity");
		/**
		 * finding the capacity and length of the string using sting buffer
		 */
		// finding the length
		int lenght = stringBuffer.length();
		// Finding the capacity
		int capacity = stringBuffer.capacity();
		System.out.println("I'm finding the lenght of the string :" + lenght);
		System.out.println("I'm finding the capacity of the string :" + capacity);
		// adding using append
		stringBuffer.append(" -->added this<--");
		System.out.println("using append  ::::" + stringBuffer);
		// adding using insert at particular position
		stringBuffer.insert(5, "-->added this<--");
		System.out.println("usign insert  ::::" + stringBuffer);

	}

}
