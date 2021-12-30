// Regular Inner Class Example 2

//Creating an object for regular inner class outside the methods of outer class

import java.lang.*;

class Outer2{
	String str = "Madhuranjan";
	Inner2 i = new Inner2();
	
	class Inner2{
		void innerMethod(){
			System.out.println("Inner class Method");
		}
	}
	
	void outerMethod(){
		System.out.println("Outer class Method");
	}
	
	public static void main(String args[]){
		Outer2 o = new Outer2();
		o.outerMethod();
		System.out.println(o.str);
		o.i.innerMethod();
	}
}