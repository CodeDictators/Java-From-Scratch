package com.codedictator.learning;

public class TypesOfVariables {
	float mySal = 100.30f;
	static String name = "Kalpesh";

	public static void main(String[] args) {
		TypesOfVariables varDemo = new TypesOfVariables();
		// Local
		int local = 20;
		System.out.println("Value of Local: " + local);
		System.out.println("Value: " + varDemo.mySal);
		System.out.println("Value: " + name);
	}

	public void add() {
		System.out.println("Value: " + mySal);
		System.out.println("Value: " + name);
	}
}
