// Java Program to demonstrate Interfaces

import java.lang.*;

interface Test{
	void meth1();
	void meth2();
}

class MyTest implements Test{
	public void meth1(){
		System.out.println("meth1() of MyTest Class");
	}
	
	public void meth2(){
		System.out.println("meth2() of MyTest class");
	}
}

class InterfaceDemo{
	public static void main(String args[]){
		// Test t = new Test(); //Invalid
		Test t = new MyTest();
		t.meth1();
		t.meth2();
		
		MyTest mt = new MyTest();
		mt.meth1();
		mt.meth2();
	}
}