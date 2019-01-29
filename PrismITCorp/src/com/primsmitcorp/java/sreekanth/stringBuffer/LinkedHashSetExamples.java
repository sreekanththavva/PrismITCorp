/**
 * 
 */
package com.primsmitcorp.java.sreekanth.stringBuffer;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * @author sreekanthreddy
 *
 */
public class LinkedHashSetExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> arylst = new ArrayList<String>();
		arylst.add("Mango");
		arylst.add("Apple");
		arylst.add("Strawberry");
		arylst.add("Mango");
		System.out.println("I'm printing arraylist using arraylist-->" + arylst);
		LinkedHashSet<String> lnkd = new LinkedHashSet<String>(arylst);
		System.out.println("I'm pritnign arraylist using linkedhashset-->" + lnkd);

	}

}
