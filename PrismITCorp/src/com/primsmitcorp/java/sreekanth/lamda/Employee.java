package com.primsmitcorp.java.sreekanth.lamda;

public class Employee {
	private String name;
	private int id;
	private int salary;
	private int age;

	public Employee(String name, int id, int salary, int age) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
