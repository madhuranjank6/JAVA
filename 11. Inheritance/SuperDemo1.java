// Java Programe to demonstrate super keyword

import java.lang.*;

class Parent8{
	int a = 10;
	int b = 20;
	
	void show1(){
		System.out.println("Parent class show1() method");
	}
	
	void show2(){
		System.out.println("Parent class show2() method");
	}
}

class Child8 extends Parent8{
	int a = 30;
	int c = 40;
	
	void show1(){
		System.out.println("Child class show1() method");
	}
	
	void show3(){
		int a = 50;
		int d = 60;
		System.out.println("Parent a = " + super.a); //super is mandatory
		System.out.println("Child a = "+this.a); //this is optional
		System.out.println("Parent b = " + b); //as there is no confusion in variables
		System.out.println(d);
		super.show1(); //super is mandatory
		this.show1(); //this is optional
		show2(); //no confusion in methods
	}
}

class SuperDemo1{
	public static void main(String args[]){
		Child8 c = new Child8();
		c.show3();
	}
}