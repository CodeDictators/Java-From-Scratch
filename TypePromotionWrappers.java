
//Why we need to convert Java provides type wrappers, which are classes that encapsulate a primitive type within an object. The type wrappers are Double, Float, Long, Integer, Short, Byte, Character, and Boolean. types and How?

//Autoboxing is the process by which a primitive type is automatically encapsulated (boxed) into its equivalent type wrapper whenever an object of that type is needed.
//Auto-unboxing is the process by which the value of a boxed object is automatically extracted (unboxed) from a type wrapper when its value is needed.

public class TypePromotionWrappers {
	public static void main(String[] args) {
		// Autoboxing
		int aInt = 10;
		Integer aObj = aInt;
		System.out.println(aInt);
		System.out.println(aObj instanceof Integer);
		System.out.println(aObj);

		// Auto-unboxing
		Integer bObj = 50;
		int bInt = bObj;
		// Method of Integer Wrapper Class
		int cInt = bObj.intValue();
		System.out.println(bInt);
		System.out.println(bObj);
		System.out.println(bObj instanceof Integer);
		System.out.println(cInt);
	}
}
