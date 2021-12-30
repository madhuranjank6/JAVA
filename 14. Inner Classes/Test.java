// Regular inner class example 3
//Creating an object for regular inner class inside the another class by using enclosing class or outside class Object

import java.lang.*;

class Outer3{
	class Inner3{
		void innerMethod(){
			System.out.println("Inner class method");
		}
	}
	
	void outerMethod(){
		System.out.println("Outer class method");
	}
}

class Test{
	public static void main(String args[]){
		Outer3 o = new Outer3();
		o.outerMethod();
		Outer3.Inner3 i = new Outer3().new Inner3();
		i.innerMethod();
		
		/*
		Outer3.Inner3 i = o.new Inner3();
		i.innerMethod();
		
		Above two lines are also Correct
		*/
	}
}