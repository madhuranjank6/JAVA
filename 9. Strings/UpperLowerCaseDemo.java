// Java Program to demonstrate "String toLowerCase()" and "String toUpperCase()" methods

import java.lang.*;
class UpperLowerCaseDemo{
	public static void main(String args[]){
		String str1 = "Java Language";
		
		//Using toUpperCase() method
		System.out.println(str1.toUpperCase()); //JAVA LANGUAGE
		
		//Using toLowerCase() method
		System.out.println(str1.toLowerCase()); //java language
		
		//Original String will remain Unchnged
		System.out.println(str1);
	}
}