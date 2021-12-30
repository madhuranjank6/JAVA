/* Java Program to demonstrate 

"StringBuffer substring(index)"
"StringBuffer substring(int index, int offset)" 
"StringBuffer replace(int index, int offset, String)"
"StringBuffer reverse()"

of the StringBuffer Class
*/

import java.lang.*;

class StringBufferMethodsDemoThree{
	public static void main(String args[]){
		StringBuffer sb1 = new StringBuffer("Java Language");
		StringBuffer sb2 = new StringBuffer("Java Language");

		//StringBuffer substring(index) method
		System.out.println(sb1.substring(5));
		
		//StringBuffer substring(int index, int offset) method
		System.out.println(sb1.substring(5,8));
		
		//StringBuffer replace(int index, int offset, String) method
		System.out.println(sb2.replace(0,4,"VB"));
		
		//StringBuffer reverse() method
		System.out.println(sb1.reverse());
	}
}