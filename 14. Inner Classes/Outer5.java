// Method Local Inner class

import java.lang.*;

class Outer5{
	int x = 10;
	static int y = 20;
	
	void outerMethod(){
		System.out.println("Outer class Method");
		class Inner5{
			void innerMethod(){
				System.out.println("Inner class Method");
				System.out.println("X = " + x);
				System.out.println("Y = "+y);
			}
		}
		Inner5 i = new Inner5();
		i.innerMethod();
	}
	
	public static void main(String args[]){
		Outer5 o = new Outer5();
		o.outerMethod();
	}
}