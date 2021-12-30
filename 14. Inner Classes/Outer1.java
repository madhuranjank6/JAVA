// Regular inner classes Example 1

//Creating an object for regular inner class inside the instance method of Outer class

import java.lang.*;

class Outer1{
	class Inner1{
		void innerMethod(){
			System.out.println("Inner Class innerMethod()");
		}
	}
	
	void outerMethod(){
		Inner1 i = new Inner1();
		i.innerMethod();
		System.out.println("Outer class outerMethod()");
	}
	
	public static void main(String args[]){
		Outer1 o = new Outer1();
		o.outerMethod();
	}
}