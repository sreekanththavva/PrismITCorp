package com.primsmitcorp.java.sreekanth.lamda;

import java.util.ArrayList;

public class SortLambda {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Sreekanth");
		list.add("Farhan");
		list.add("Daya");
		list.add("Srinadh");
		list.add("Narendra");
		list.add("Venkat");
		list.add("Dinesh");
		list.add("Prashanth");

		list.stream().map(String::toUpperCase).sorted().forEach(System.out::println);

	}
}