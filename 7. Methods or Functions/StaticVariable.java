//STATIC VARIABLES

/*
	DECLARATION: With static keyword Inside the class but outside the methods, constructor or blocks
	SCOPE: Inside the all methods, constructors and blocks, and also we can access it directly from the static methods.
	MEMORY ALLOCATION: When we run the program, the memory for static variables get allocated in non-heap or static memory
	DEFAULT VALUE: Static variables have some default values, e.g., int -> 0, boolean -> false, etc.
	ACCESS SPECIFIERS: We can use access specifiers with the static variable
	HOW TO ACCESS: It can be access in 3 ways:
				   1. Directly
				   2. By class name
				   3. By the object reference name
*/

import java.lang.*;
class StaticVariable{
	static int a = 20; // Static Variable
	static int b; // uninitialized Static variable
	public void method1(){
		// We can access static variables inside non-static methods directly
		System.out.println("Value of a inside non-static method = "+ a); //200
		System.out.println("Value of uninitialized variable = " + b); //0 as we have not initialized b so it will print the default value
		
		//We can access it also using class name
		System.out.println("Value of a using class name inside non-static method= "+StaticVariable.a);
	}
	
	public static void main(String args[]){
		// We can access static variables inside non-static methods directly
		System.out.println("Value of a inside static method without object creation = " + a); //20
		// We can access static variables with class name also
		System.out.println("Value of a using class name inside static method = "+ StaticVariable.a); // 20
		//We can access static variable by creating object of the class also
		StaticVariable ob1 = new StaticVariable();
		System.out.println("Value of a inside static method = " + ob1.a);
		ob1.method1();	
	}
}