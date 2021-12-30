// Java Program to demonstrate Constructors in Inheritance

import java.lang.*;

class Parent1{
	Parent1(){
		System.out.println("Parent class Constructor");
	}
}

class Child1 extends Parent1{
	Child1(){
		System.out.println("Child1 class Constructor");
	}
}

class Child2 extends Child1{
	Child2(){
		System.out.println("Child2 class Constructor");
	}
}

//Driver Class

class ConstructorInInheritance{
	public static void main(String args[]){
		Child2 c = new Child2();
	}
}