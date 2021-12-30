// Java Program to demonstrate super() or super(...)

import java.lang.*;

class Parent8{
	Parent8(){
		System.out.println("Parent class 0-Parameterized constructor");
	}
	
	Parent8(int x){
		System.out.println("Parent class Parameterized constructor");
	}
}

class Child8 extends Parent8{
	Child8(){
		this(10,20);
		System.out.println("Child class 0-Parameterized constructor");
	}
	
	Child8(int x){
		this();
		System.out.println("Child class 1-Parameterized constructor");
	}
	
	Child8(int x, int y){
		super(10);
		System.out.println("Child class 2-Parameterized constructor");
	}
}


class SuperDemo2{
	public static void main(String args[]){
		Child8 c = new Child8(10);
	}
}