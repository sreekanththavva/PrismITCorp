package com.primsmitcorp.java.sreekanth.serialization;

public class Child extends Parent {
	int child = 4;

	public Child() {
		System.out.println("Son Constructor...");
		child = 5;
	}

	{
		child = 6;
	}
}