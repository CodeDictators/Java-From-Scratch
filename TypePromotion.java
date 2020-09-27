// One type is promoted to another implicitly if no matching data type is found.

//Widening conversions do not lose information about the magnitude of a value.

// From a byte to a short, an int, a long, a float, or a double
// From a short to an int, a long, a float, or a double
// From a char to an int, a long, a float, or a double
// From an int to a long, a float, or a double
// From a long to a float or a double
// From a float to a double

//Here are the Type Promotion Rules:
//All byte and short values are promoted to int.
//If one operand is a long, the whole expression is promoted to long.
//If one operand is a float, the entire expression is promoted to float.
//If any of the operands is double, the result is double.

public class TypePromotion {
	public static void main(String[] args) {
		// implicit Cast
		byte x = 10;
		byte y = 20;
		int z = x + y;

		// explicit Cast
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);

		// implicit Cast ( int promotated to float )
		int intVal = 10;
		float fVal = 5.5f;
		float ans = intVal * fVal;

		// implicit Cast ( char promotated to int and save it's ASCII value)
		char charVal = 'A';
		int charToint = charVal;
		System.out.println(charToint);// 65
	}
}
