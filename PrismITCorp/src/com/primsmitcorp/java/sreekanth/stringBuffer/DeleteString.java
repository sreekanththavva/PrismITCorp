/**
 * 
 */
package com.primsmitcorp.java.sreekanth.stringBuffer;

/**
 * @author sreekanthreddy
 *
 */
public class DeleteString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Declaring and initializing
		 */
		StringBuffer stringBuffer = new StringBuffer("Deleting the string");
		// printing before string
		System.out.println("Before Deletion-->" + stringBuffer);
		// after deletion
		stringBuffer.delete(3, 7);
		System.out.println("After Deletion from 3 to 7-->" + stringBuffer);

	}

}
