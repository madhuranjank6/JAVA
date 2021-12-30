// Java Program to demonstrate Abstract Classes

import java.lang.*;

abstract class Super{
	
	//Constructor
	public Super(){
		System.out.println("Super Constructor");
	}
	
	//General Method
	public void meth1(){
		System.out.println("Super meth1()");
	}
	
	//Abstract Method
	abstract void meth2();
}

class Sub extends Super{
	@Override
	void meth2(){
		System.out.println("Sub meth2()");
	}
}

class AbstractExample1{
	public static void main(String args[]){
		// Super s = new Super(); //Invalid
		
		Super s = new Sub();
		s.meth1();
		s.meth2();
		
		Sub sb = new Sub();
		//sb.meth1();
		sb.meth2();
	}
}