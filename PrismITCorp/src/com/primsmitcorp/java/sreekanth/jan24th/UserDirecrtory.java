package com.primsmitcorp.java.sreekanth.jan24th;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserDirecrtory {
	private static Scanner scanner;

	public static void main(String[] args) {

		System.out.println(System.getProperty("user.dir"));
		File file = new File(System.getProperty("user.dir") + "/Sample.txt");

		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
