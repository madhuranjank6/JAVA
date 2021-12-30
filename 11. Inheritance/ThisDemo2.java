// Java Program to demonstrate this() and this(...)

import java.lang.*;

class Demo3{
	Demo3(){
		this(10);
		System.out.println("This is Zero parameterized constructor");
	}
	
	Demo3(int x){
		System.out.println("1-Parameterized Constructor");
	}
	
	Demo3(int x, int y){
		this();
		System.out.println("2-parameterized constructor");
	}
}

class ThisDemo2{
	public static void main(String args[]){
		Demo3 d = new Demo3(20,30);
	}
}