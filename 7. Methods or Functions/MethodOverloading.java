/*
	one or more functions having same name but different parameter lists and data types are called as Method Overloading
*/

import java.lang.*;
import java.util.Scanner;

class MethodOverloading{
	static int max(int x, int y){
		return x>y?x:y;
	}
	static float max(float x, float y){
		return x>y?x:y;
	}
	static int max(int x, int y, int z){
		return x>y&&x>z?x:(y>z?y:z);
	}
	
	public static void main(String args[]){
		int x = 10, y = 20, z = 30;
		float a = 12.5f, b = 20.2f;
		
		//Below method with two int arguments will be called
		System.out.println(max(x,y));
		
		//Below method with two float arguments will be called
		System.out.println(max(a,b));
		
		//Below method with three int arguments will be called
		System.out.println(max(x,y,z));
	}
}