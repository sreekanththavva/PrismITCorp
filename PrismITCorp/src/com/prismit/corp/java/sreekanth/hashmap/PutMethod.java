/**
 * 
 */
package com.prismit.corp.java.sreekanth.hashmap;

import java.util.HashMap;

/**
 * @author sreekanthreddy
 *
 */
public class PutMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("England", "Landon");
		map.put("Germany", "Frankfurt");
		map.put("India", "Delhi");
		for (String index : map.keySet()) {
			System.out.println(index);
		}
		for (String index : map.values()) {
			System.out.println(index);
		}
		for (String index : map.keySet()) {
			System.out.println("key :" + index + " & values :" + map.get(index));
		}
		System.out.println("Size of the map :" + map.size());
		System.out.println("for Ge rmany" + map.get("Germany"));
		map.remove("Germany");
		map.clear();
		System.out.println(map);

	}

}
