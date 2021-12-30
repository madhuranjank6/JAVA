// Java Program to demonstrate the methos "StringBuffer deleteCharAt(index)" and StringBuffer delete(int index, int //     offset)" of the StringBuffer Class

import java.lang.*;

class StringBufferMethodsDemoTwo{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer("Java Language");
		System.out.println(sb);
		
		//deleteCharAt(int index) method
		System.out.println(sb.deleteCharAt(1));
		
		//delete(int index, int offset) method
		System.out.println(sb.delete(4,9));
		
		System.out.println(sb);
	}
}