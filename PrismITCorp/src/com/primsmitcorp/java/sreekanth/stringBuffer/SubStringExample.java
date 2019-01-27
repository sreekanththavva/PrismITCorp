/**
 * 
 */
package com.primsmitcorp.java.sreekanth.stringBuffer;

/**
 * @author sreekanthreddy
 *
 */
public class SubStringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Before SubString printing");
		System.out.println(stringBuffer);
		
		System.out.println(stringBuffer.substring(7));
		System.out.println(stringBuffer.substring(7,16));

		
	}

}
