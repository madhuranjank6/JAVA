// Java Program to demonstrate "String intern()" method

import java.lang.*;
class InternMethodDemo{
	public static void main(String args[]){
		String str1 = new String("java");
		String str2 = str1.intern();
		
		System.out.println(str1); // java
		System.out.println(str2); // java
	}
}