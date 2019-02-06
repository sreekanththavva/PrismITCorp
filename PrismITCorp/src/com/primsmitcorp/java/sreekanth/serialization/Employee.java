package com.primsmitcorp.java.sreekanth.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	public String name;
	public static int id;
	public transient int ssn;
	public String address;

}
