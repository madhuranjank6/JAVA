//Java Program to demonstrate "int indexOf()" and "int lastIndexOf()" methods

import java.lang.*;
class IndexOfDemo{
	public static void main(String args[]){
		String str = "Java Language";
		
		System.out.println(str.indexOf('a')); //1
		System.out.println(str.indexOf("Lan")); //5
		System.out.println(str.indexOf('p')); //-1
		
		System.out.println(str.lastIndexOf('a')); // 10
		System.out.println(str.lastIndexOf("ngu")); // 7
		System.out.println(str.lastIndexOf("Lanx")); // -1
		
		System.out.println(str.indexOf('a',3)); // 3
	}
}