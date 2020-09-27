package com.codedictator.learning;

public class DataTypesDemo {
	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40l;
		float f = 20.20f;
		double d = 30.30;
		char c = 'A';
		boolean flag = false;

		System.out.println("byte Value" + b);
		System.out.println("short Value" + s);
		System.out.println("int Value" + i);
		System.out.println("long Value" + l);
		System.out.println("float Value" + f);
		System.out.println("double Value" + d);
		System.out.println("char Value" + c);
		System.out.println("boolean Value" + flag);

		int intArray[] = { 10, 20, 30, 40 };
		char charArray[] = new char[5];
		charArray[0] = 'A';
		charArray[1] = 'B';
		charArray[2] = 'C';
		charArray[4] = 'D';

		DataTypesDemo myClass = new DataTypesDemo();
		Object o = new Object();

	}
}
