// Java Program to demonstrate "char charAt()" method

import java.lang.*;
class StringCharAt{
	public static void main(String args[]){
		String str = "Java Language";
		
		//Accessing Character at particular Index
		System.out.println(str.charAt(0)); //J
		System.out.println(str.charAt(5)); //L
		// System.out.println(str.charAt(100)); //StringIndexOutOfBoundException
		
		//Accessing char by char
		String str1 = new String("Java Language");
		for(int i = 0; i < str1.length();i++){
			char ch = str1.charAt(i);
			System.out.print(ch);
		}
	}
}