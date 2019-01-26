package com.primsmitcorp.java.sreekanth.jan24th;

public class T1 {

	public static void main(String[] args) {

		Rope game = new Rope();
		// game.begin();
		game.start();
		for (int check = 11; check <= 20; check++) {
			System.out.print(" " + check);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// System.out.println("D");
		// game.walk();
		// System.out.println("E");
	}

}
