// Static Nested class Demo

import java.lang.*;

class Outer6{
	int x = 10;
	static int y = 20;
	
	static class Inner6{
		void innerMethod(){
			System.out.println("Static inner class Method");
			//System.out.println("X = "+x); //Invalid
			System.out.println("Y = "+y);
		}
	}
	
	void outerMethod(){
		System.out.println("Outer class Method");
	}
}


class Test4{
	public static void main(String args[]){
		Outer6 o = new Outer6();
		o.outerMethod();
		
		Outer6.Inner6 i = new Outer6.Inner6();
		i.innerMethod();
	}
}