package com.primsmitcorp.java.sreekanth.lamda;

public class OperartionsEx {

	public static void main(String[] args) {

		OperartionsEx test = new OperartionsEx();

		MathOperation addition = (a, b) -> a + b;
		int add = test.operate(2, 3, addition);
		System.out.println("additon -->" + add);

		MathOperation multiplication = (a, b) -> a * b;
		int mul = test.operate(4, 2, multiplication);
		System.out.println("multiplication -->" + mul);

		MathOperation subtraction = (a, b) -> a + b;
		int sub = test.operate(10, 4, subtraction);
		System.out.println("subtraction -->" + sub);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
