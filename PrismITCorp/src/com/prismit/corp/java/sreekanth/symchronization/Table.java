package com.prismit.corp.java.sreekanth.symchronization;

public class Table {
	// creating method called printTable
	synchronized void printTable(int numb) {
		// Using for loop printing the table
		for (int index = 1; index <=10; index++) {
			System.out.println(index+" * "+numb+" = " + (numb * index));
			// trying to catch the exception
			try {
				// just try to print the values in 1 sec delay
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
