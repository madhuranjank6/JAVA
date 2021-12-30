// Java Program to demonstrate the methos "int length()" , "StringBuffer append(content)" and StringBuffer insert(int //   index, content)" of the StringBuffer Class

import java.lang.*;

class StringBufferMethodsDemoOne{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		
		//append() method
		System.out.println(sb.append(" Language"));
		
		//length() method
		System.out.println(sb.length());
		
		//insert() method
		System.out.println(sb.insert(4, " is Good"));
	}
}