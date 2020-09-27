package com.codedictator.learning;

public class TypePromotionWrappers {
	public static void main(String[] args) {
		int a = 10;
		Integer intObj = a;
		System.out.println(a);
		System.out.println(intObj instanceof Integer);
		System.out.println(intObj);

		Integer bObj = 50;
		int bPri = bObj;

		int bPri1 = bObj.intValue();
		System.out.println(bObj instanceof Integer);
		

	}
}
