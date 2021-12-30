// Java Program to explain the basic syntax of StringBuffer

import java.lang.*;

class StringBufferDemo{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		System.out.println(sb.append(" Language")); //Java Language
		System.out.println(sb);
		
		sb = new StringBuffer("VB Language");
		System.out.println(sb);
	}
}