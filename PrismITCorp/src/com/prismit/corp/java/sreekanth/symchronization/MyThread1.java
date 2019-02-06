package com.prismit.corp.java.sreekanth.symchronization;

public class MyThread1 extends Thread {

	Table table;

	MyThread1(Table table) {
		this.table = table;
	}

	public void run() {
		table.printTable(5);
	}

}
