// Java Program to demonstrate "String substring(int index)" And "String substring(int index, int offset)" Methods

import java.lang.*;
class SubstringDemo{
	public static void main(String args[]){
		String str = "Java Language is Good";
		
		System.out.println(str.substring(5)); //Language is Good
		System.out.println(str.substring(0,4)); // Java
		System.out.println(str.substring(5,8)); // Lan
	}
}