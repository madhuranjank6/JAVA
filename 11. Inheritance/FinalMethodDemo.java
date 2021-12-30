// Final Method demo

import java.lang.*;

class Parent7{
	final void show(){
		System.out.println("Parent class show() method");
	}
}

class Child7 extends Parent7{
	/*
	//final methods can not be overridden
	void show(){
		System.out.println("Child class show() method");
	}*/
}

class FinalMethodDemo{
	public static void main(String args[]){
		Child7 c = new Child7();
		c.show();
	}
}