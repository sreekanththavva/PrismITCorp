package com.prismit.corp.java.sreekanth.singleton;

public class ClassB {
	
	private ClassB() {

	}

	public static ClassB getInstanceUsingDoubleLocking() {
		Object instance = null;
		if (instance == null) {
			synchronized (ClassB.class) {
				if (instance == null) {
					instance = new ClassB();
				}
			}
		}
		return getInstanceUsingDoubleLocking();
	}

	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		ClassB b = ClassB.getInstanceUsingDoubleLocking();
		int z = b.add(3, 4);
		System.out.println(z);

		ClassB a = ClassB.getInstanceUsingDoubleLocking();
		int e = a.add(3, 9);
		System.out.println(e);

	}
}
