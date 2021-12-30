// Java Program to demonstrate "boolean startsWith(String)" and "boolean endsWith(String)" method

import java.lang.*;
class StartsWithEndsWithDemo{
	public static void main(String args[]){
		String str = "Java Language";
		
		//Using startsWith(String) method
		System.out.println(str.startsWith("Jav")); //true
		System.out.println(str.startsWith("javax")); //false
		
		//Using endsWith(String) method
		System.out.println(str.endsWith("age")); //true
		System.out.println(str.endsWith("agex")); //false
	}
}