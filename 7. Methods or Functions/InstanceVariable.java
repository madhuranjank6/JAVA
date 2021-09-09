//INSTANCE VARIABLES

/*
	DECLARATION: Inside the class but outside the methods, constructor or blocks
	SCOPE: Inside the all methods, constructors and blocks, however we cannot access it inside static method directly (we need to create object of the class to 	  access it from static methods).
	MEMORY ALLOCATION: When the object of the class is created, the memory gets allocated inside heap memory and when objects gets destroyed the variables releases the memory.
	DEFAULT VALUE: Instance variables have some default values, e.g., int -> 0, boolean -> false, etc.
	ACCESS SPECIFIERS: We can use access specifiers with the instance variable
	HOW TO ACCESS: It can be access directly from non-static method, whereas it can be accessed by creating object of the class from the static method
*/

import java.lang.*;
class InstanceVariable{
	int a = 200; // Instance Variable
	int b; // uninitialized Instance variable
	public void method1(){
		// As the method is not static we can access Instance Variable directly here
		System.out.println("Value of a inside non-static method = "+ a); //200
		System.out.println("Value of uninitialized variable = " + b); //0 as we have not initialized b so it will print the default value
	}
	
	
	public static void main(String args[]){
		// Below line will give error as main method is static and we cannot access instance variable directly inside static methods
		// System.out.println(a); //Error
		
		//We need to create an object to access instance variable from a static method
		InstanceVariable ob1 = new InstanceVariable();
		System.out.println("Value of a inside static method = " + ob1.a);
		ob1.method1();
		
	}
	
}
