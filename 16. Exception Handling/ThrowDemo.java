// Java Program to demonstrate throw keyword

import java.lang.*;
import java.io.*;

class ThrowDemo{
	public static void main(String args[]) throws IOException{
		System.out.println("First Line in main");
		int a, b, c = 0;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
		try{
			if(b == 0){
				ArithmeticException ae1 = new ArithmeticException("\\ by 0");
				throw ae1;
			}
			c = a/b;
			System.out.println("Division = "+c);
		}
		catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}
		System.out.println("Last line in main()");
	}
}