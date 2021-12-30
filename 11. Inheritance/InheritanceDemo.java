// Java Program to demonstrate Inheritance

import java.lang.*;

//Parent class
class Parent{
	int a = 10;
	int b = 20;
	
	void show(){
		System.out.println("a = "+a + "\t"+"b = "+b);
	}
}

//Child class
class Child extends Parent{
	int c = 30;
	int d = 40;
	
	void display(){
		a = 300;
		b = 400;
		
		System.out.println("a = " + a +"\tb = "+b);
		System.out.println("c = " + c +"\td = "+d);
	}
}


//Driver Class

class InheritanceDemo{
	public static void main(String args[]){
		//Object of parent class
		Parent p = new Parent();
		p.show();
		//p.display(); //Invalid
		
		//Object of child class
		Child c = new Child();
		c.show();
		c.display();
		c.show();
	}
}