package com.primsmitcorp.java.sreekanth.jan24th;

public class Rope extends Thread{

	public void run() {
		for(int check=0;check<=10;check++) {
			System.out.println(" "+check);	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	void begin() {
		System.out.println("B");
	}

}
