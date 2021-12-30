// Java Program to demonstarte Overridding Demo

import java.lang.*;

class Parent5{
	void show(){
		System.out.println("Parent class show method");
	}
}


class Child5 extends Parent5{
	/* Overridding the show method */
	void show(){
		System.out.println("Child class show method");
	}
	
	/* display() method is not overridden */
	void display(){
		System.out.println("Child class display() method");
	}
}

class OverriddingDemo{
	public static void main(String args[]){
		Parent5 p = new Parent5();
		p.show();
		
		Child5 c = new Child5();
		c.show();
		c.display();
	}

}