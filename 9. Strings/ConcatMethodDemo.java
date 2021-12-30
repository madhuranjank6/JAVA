// Java Program to demonstrate "String concat(String)" method

import java.lang.*;
class ConcatMethodDemo{
	public static void main(String args[]){
		String str1 = "Java";
		String str2 = "Language";
		
		//Using Concat(String) Method
		String str3 = str1.concat(str2);
		System.out.println(str3);
		System.out.println(str1.concat("World"));
		
		//Original String will remain unmodified
		System.out.println(str1);
		System.out.println(str2);
	}
}