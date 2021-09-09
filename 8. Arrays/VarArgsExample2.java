/*
	Internally, var-args paremeter is implemented using single dimension array, hence within the var-args method we can access different arguments by using indexes.
*/

import java.lang.*;

class VarArgsExample2{
	static void sum(int ...x){
		int total = 0;
		for(int i = 0; i < x.length; i++){
			total = total + x[i];
		}
		System.out.println("The Sum = " + total);
	}
	
	//Main Method
	public static void main(String agrs[]){
		sum(); //Calling with 0 Arguments
		sum(10); //Calling with 1 arguments
		sum(10,20); //Calling with 2 arguments
		sum(10,20,30,40); //Calling with 4 argumengts
	}
}