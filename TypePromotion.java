package com.codedictator.learning;

public class TypePromotion {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);

		int intVal = 10;
		float fVal = 5.5f;
		int ans = (int) (intVal * fVal);

		char charVal = 'A';
		int charToint = charVal;
		System.out.println(charToint);
	}
}
//Type mismatch: cannot convert from float to int