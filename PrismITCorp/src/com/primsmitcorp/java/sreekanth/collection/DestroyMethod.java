package com.primsmitcorp.java.sreekanth.collection;

public class DestroyMethod {

	public static void main(String[] args) {
		{
			try {
				// creating a new process
				System.out.println("Creating a new process");
				Process p1 = Runtime.getRuntime().exec("notepad.dmg");

				p1.destroy();
				System.out.println("Process destroyed");
			} catch (Exception e) {
				System.out.println("Exception e");
			}

		}
	}
}