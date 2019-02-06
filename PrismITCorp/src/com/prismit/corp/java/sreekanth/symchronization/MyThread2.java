package com.prismit.corp.java.sreekanth.symchronization;

public class MyThread2 extends Thread{

	Table table;
	public MyThread2(Table table) {
		super();
		this.table = table;
	}

	public void run() {
		table.printTable(20);
	}
}
