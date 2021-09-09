//LOCAL VARIABLES

/*
	DECLARATION: Inside method constructor or blocks
	SCOPE: Inside the same method, constructor or blocks in which it is defined.
	MEMORY ALLOCATION: When the method, constructor or blocks gets executed, the memory gets allocated in stack memory
	DEFAULT VALUE: It doesnt't have any default value, We must provide value before use otherwise we will get error
	ACCESS SPECIFIERS: We cannot use access specifiers with the local variable
*/

import java.lang.*;
class LocalVariable{
	public static void method1(){
		int a = 10, b;
		System.out.println(a); //10
		// System.out.println(b); //This will give error as variable b is not initialized
	}
	
	public static void method2(){
		int c = 20;
		System.out.println(c); // 20
		
		// This will give error as a is local variable of method1 and we cannot access it from method2
		// System.out.println(a); 
	}
	
	public static void main(String args[]){
		int d = 20;
		System.out.println(d);
		method1();
		method2();
		// This will give error as a is local variable of method1 and we cannot access it from main method
		// System.out.println(a);
		// This will give error as a is local variable of method2 and we cannot access it from main method
		// System.out.println(c);
	}
	
}