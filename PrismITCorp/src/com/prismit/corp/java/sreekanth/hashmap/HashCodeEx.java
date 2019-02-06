package com.prismit.corp.java.sreekanth.hashmap;

public class HashCodeEx {

	int number;

	public HashCodeEx(int number) {
		this.number = number;
	}

	public int hascode() {
		return number;
	}

	@Override
	public String toString() {
		return "HashCodeEx [number=" + this.number + "]";
	}

	public static void main(String[] args) {

		HashCodeEx ex = new HashCodeEx(10);
		HashCodeEx ex2 = new HashCodeEx(20);

		System.out.println(ex.hascode());
		System.out.println(ex2.hascode());

		System.out.println(ex.hascode() == ex2.hascode());
		System.out.println(ex.equals(ex2));

	}

}
