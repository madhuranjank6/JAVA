// Java Program to demonstrate Meta Characters

import java.lang.*;
class MetaCharacters{
	public static void main(String args[]){
		String str1 = "2";
		String str2 = " ";
		String str3 = "a";
		
		System.out.println(str1.matches("\\d"));
		System.out.println(str1.matches("\\D"));
		System.out.println(str2.matches("\\s"));
		System.out.println(str2.matches("\\S"));
		System.out.println(str3.matches("\\w"));
		System.out.println(str3.matches("\\W"));
	}
}