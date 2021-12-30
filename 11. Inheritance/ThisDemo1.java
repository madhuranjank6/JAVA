// Java Program to demonstrate 'this' keyword

import java.lang.*;

class Demo2{
	int a = 10;
	int b = 20;
	static int x = 99;
	
	void show(){
		int a = 30;
		int c = 40;
		System.out.println("Instance a = "+this.a); // 'this' keyword is mandatory here
		System.out.println("Local a = "+a); // Local Variable
		System.out.println("Instance b = "+this.b); //'this' keyword is Optional here
		System.out.println("Static x = "+this.x); //'this' keyword is Optional here
		this.display(); //'this' keyword is optional here
	}
	
	void display(){
		System.out.println("This is display() method");
	}
}

class ThisDemo1{
	public static void main(String args[]){
		Demo2 d = new Demo2();
		d.show();
	}
}