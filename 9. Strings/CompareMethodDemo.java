// java Program to demonstrate "int compareTo(String)" and "int compareToIgnorecase(String)" Methods

import java.lang.*;
class CompareMethodDemo{
	public static void main(String args[]){
		String str1 = "Java";
		String str2 = "JAVA";
		String str3 = "c";
		
		// Using compareTo(String) method
		System.out.println(str1.compareTo(str2));
		System.out.println(str3.compareTo("a"));
		
		// Using compareToIgnoreCase(String) method
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str3.compareToIgnoreCase("C"));
	}
}