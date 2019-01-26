/**
 * Description : I'm printing grade using marks
 */
package com.primsmitcorp.java.sreekanth.jan24th;

import java.util.Scanner;

/**
 * @author sreekanthreddy
 *
 */
public class SwitchStatement {
	/**
	 * here I'm just written marks using switch case
	 */

	private static Scanner scan;

	/**
	 * I created a method to print marks
	 * 
	 * @param score
	 */

	public static void marks(int score) {
		switch (score) {
		case 10:
			System.out.println(" Fail");
			break;
		case 20:
			System.out.println(" Fail");
			break;
		case 30:
			System.out.println(" Fail");
			break;
		case 50:
			System.out.println(" Average Marks");
			break;
		case 70:
			System.out.println(" Good");
			break;
		case 90:
			System.out.println(" Top Marks");
			break;

		default:
			System.out.println("choose only one of these :10,20,30,50,70,90");
			break;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * here I'm asking to the user to give their marks
		 */
		scan = new Scanner(System.in);
		/**
		 * finally I'm calling the method to print the grade using the their marks
		 */
		System.out.println("Enter your marks");
		int scr = scan.nextInt();
		marks(scr);

	}

}
