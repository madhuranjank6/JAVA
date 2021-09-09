// Method Overloading and Var-args method

import java.lang.*;

class VarArgsExample3{
	static void methodOne(int i){
		System.out.println("General Method");
	}
	
	static void methodOne(int ...i){
		System.out.println("Var-args Method");
	}
	
	//Main Method
	public static void main(String agrs[]){
		methodOne(); //var-args method
		methodOne(10,20); //var-args method
		methodOne(10); //general method
	}
}