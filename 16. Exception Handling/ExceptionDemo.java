// Java Program to demonstrate Exception

import java.io.*;

class ExceptionDemo{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any two  numbers: ");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("main() method started");
		System.out.println("Addition = "+(a+b));
		System.out.println("Division = " +(a/b));
		System.out.println("Multiplication = "+(a*b));
		System.out.println("main() methods ends");
	}
}
