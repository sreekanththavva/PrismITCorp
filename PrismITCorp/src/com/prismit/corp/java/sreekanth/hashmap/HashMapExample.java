/**
 * 
 */
package com.prismit.corp.java.sreekanth.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sreekanthreddy
 *
 */
public class HashMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<String, String> phonebook = new HashMap<String, String>();
		phonebook.put("Sreekant", "123");
		phonebook.put("Dinesh", "124");
		phonebook.put("Srinadh", "125");
		phonebook.put("Prasanth", "126");
		phonebook.put("Farhan", "127");
		phonebook.put("Sandeep", "128");
		phonebook.put("Ashish", "129");

		System.out.println(phonebook.get("Srinadh"));
		System.out.println("=================");

		for (String index : phonebook.keySet()) {
			System.out.println(index + " : " + phonebook.get(index));

		}
		java.util.Set<Map.Entry<String, String>> values = phonebook.entrySet();
		System.out.println("=================");
		for (Map.Entry<String, String> e : values) {
			System.out.println(e.getKey() + " : " + e.getValue());
			e.setValue("III");
		}
		System.out.println("=================");


	}

}
