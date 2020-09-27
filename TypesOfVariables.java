
//A variable is a container which holds the value while the program is executed. A variable is assigned with a data type. Variable is a name of memory location. 

//There are three types of variables in java: 
//	1. Local variable
//	2. Instance variable
//	3. Static variable

public class TypesOfVariables {
	//Instance variable A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.
	float mySal = 100.30f;

	//Static variable A variable declared inside the class but outside the body of the method, with keyword static is called static variable.
	static String name = "Kalpesh";

	public static void main(String[] args) {
		TypesOfVariables varDemo = new TypesOfVariables();
		// Local variable A variable declared inside the body of the method is called local variable. 
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
