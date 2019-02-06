package com.primsmitcorp.java.sreekanth.serialization;

import java.io.Serializable;

public class Parent implements Serializable {

	int parent = 1;

	public Parent() {
		System.out.println("Father Constructor...");
		parent = 3;
	}

	{
		parent = 2;
		System.out.println("Instance Block....");
	}

}