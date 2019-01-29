package com.primsmitcorp.java.sreekanth.collection;

import java.lang.StringBuffer;

class PracticeExamples {
	public static void main(String args[]) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb1 length: " + sb1.length());
		System.out.println("sb1 capacity: " + sb1.capacity());

		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb2 length: " + sb2.length());
		System.out.println("sb2 capacity: " + sb2.capacity());

		String str1 = "hello";
		StringBuffer sb3 = new StringBuffer(str1);
		System.out.println("sb3 length: " + sb3.length());
		System.out.println("sb3 capacity: " + sb3.capacity());

		CharSequence seq1 = "hello";
		StringBuffer sb4 = new StringBuffer(seq1);
		System.out.println("sb4 length: " + sb4.length());
		System.out.println("sb4 capacity: " + sb4.capacity());
	}
}