// Java Program to demonstarte Static variables and Methods in Inheritance

import java.lang.*;

class Parent3{
	static int a = 10;
	static int b = 20;
	
	static void show(){
		System.out.println("a = "+a+"\tb = "+b);
	}
}

class Child3 extends Parent3{
	static void display(){
		a = 300;
		b = 400;
		System.out.println("a = "+a+"\tb = "+b);
	}
}

//Driver Class

class Inheritance3{
		public static void main(String args[]){
			Child3.show(); //As show() method is static we can access it directly
			Child3.display(); //As display() method is static we can access it directly
			//we can also access variables using class name directly
			System.out.println("a = "+Child3.a+"\tb = "+Child3.b);
		}
}