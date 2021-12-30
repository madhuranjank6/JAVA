// Java Program to demonstrate Static imports

import static java.lang.Math.max;
import static java.lang.Math.PI;
import static java.lang.Math.*;
import static java.lang.Integer.*;

class StaticImport1{
	public static void main(String args[]){
		System.out.println(max(10,2));
		// System.out.println(min(10,2)); //Compiler will get confuse here as min() method is available in both Math and // Integer class
		System.out.println(sqrt(2));
		System.out.println(pow(10,2));
		System.out.println(random()*100);
		System.out.println(PI);
		System.out.println(MIN_VALUE);
	}
}