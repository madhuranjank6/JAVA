// Passing varibale number of arguments to a method

//After java 1.5 version onwards it is possible to pass varible number of arguments to a method

import java.lang.*;
class VarArgsExample1{
	//Declaring method which takes variable number of arguments
	static void methodOne(int ...x){
		System.out.println("Var-Args Method");
	}
	
	// Main Method
	public static void main(String args[]){
		methodOne(); //Calling with o arguments
		methodOne(10); //Calling with 1 arguments
		methodOne(10,20,30); //Calling with 3 arguments
	}
}