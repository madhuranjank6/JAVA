// java Program to demonstrate "boolean equals(String)" and "boolean equalsIgnoreCase(String)" Methods

import java.lang.*;
class EqualsNotEqualsDemo{
	public static void main(String args[]){
		String str1 = "Java";
		String str2 = "JAVA";
		String str3 = "Java";
		
		// Using equals(String) method
		System.out.println(str1.equals(str2)); //false
		System.out.println(str1.equals(str3)); //True
		
		// Using equalsIgnoreCase(String) method
		System.out.println(str1.equalsIgnoreCase(str2)); //True
		System.out.println(str1.equalsIgnoreCase(str3)); //True
	}
}