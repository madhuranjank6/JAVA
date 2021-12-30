// Java Program to demonstrate "String replace("old String", "new String")" method

import java.lang.*;
class ReplaceMethodDemo{
	public static void main(String args[]){
		String str = "Java Language";
		
		System.out.println(str.replace("Java","VB"));
		System.out.println(str.replace("xyz","VB"));
	}
}