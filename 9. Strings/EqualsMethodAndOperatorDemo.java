// Java Program to demonstrate difference between .equals() method and == operator

import java.lang.*;
class EqualsMethodAndOperatorDemo{
	public static void main(String args[]){
		String str1 = new String("java");
		String str2 = new String("java");
		String str3 = "java";
		String str4 = "java";
		
		//Using .equals() method for content comparison
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals(str3)); //true
		System.out.println(str1.equals(str4)); //true
		
		//Using == Operator for Address Comparison
		System.out.println(str1 == str2); //true
		System.out.println(str1 == str3); //false
		System.out.println(str3 == str4); //true
	}
}