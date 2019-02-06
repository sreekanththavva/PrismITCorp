/**
 * 
 */
package com.prismit.corp.java.sreekanth.symchronization;

/**
 * @author sreekanthreddy
 *
 */
public class MainMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Table table = new Table();
		MyThread1 thread1 = new MyThread1(table);
		MyThread2 thread2 = new MyThread2(table);
		thread1.start();
		thread2.start();
	}
}
