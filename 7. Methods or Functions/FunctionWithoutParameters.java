import java.lang.*;
import java.util.Scanner;

public class FunctionWithoutParameters{
	public static void main(String args[]){
		System.out.println("This is main");
		//Calling functions from the main
		func1();
		func2();
	}
	
	// func1 definition
	public static void func1(){
		System.out.println("This is func1");
	}
	
	// func2 definition
	public static void func2(){
		System.out.println("This is func2");
		//Calling another function inside a function
		func1();
	}
}