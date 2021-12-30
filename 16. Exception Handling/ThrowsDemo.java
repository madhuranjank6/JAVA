// Java Program to demonstrate throws keyword


import java.lang.*;

class ThrowsDemo{
	static void m1(){
		System.out.println("First line in m1()");
		m2();
		System.out.println("Last line in m1()");
	}
	
	public static void main(String args[]){
		System.out.println("First line in main");
		m1();
		System.out.println("Last line in main");
	}
	
	static void m2(){
		System.out.println("First line in m2()");
		try{
			m3();
		}
		catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}
		System.out.println("Last line in m2()");
	}
	
	static void m3() throws ArithmeticException{
		System.out.println("First line in m3()");
		System.out.println("Division = " + 10/0);
		System.out.println("Last line in m3()");
	}
}