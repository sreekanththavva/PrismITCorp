/**
 * 
 */
package com.primsmitcorp.java.sreekanth.stringBuffer;

/**
 * @author sreekanthreddy
 *
 */
public class Replace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Replacing from the given string");
		System.out.println(stringBuffer);
		stringBuffer.replace(6, 9, "ed");
		System.out.println(stringBuffer);

	}

}
