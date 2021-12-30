// Java Program to demonstrate Matching Symbols

import java.lang.*;
class MatchingSymbols{
	public static void main(String args[]){
		String str1 = "a";
		String str2 = "a2";
		String str3 = "abcdef";
		
		System.out.println(str1.matches("."));
		System.out.println(str1.matches("[abc]"));
		System.out.println(str1.matches("[^abc]"));
		System.out.println(str3.matches("."));
		System.out.println(str2.matches("[a-z][1-7]"));
		System.out.println(str3.matches("XZ"));
	}
}