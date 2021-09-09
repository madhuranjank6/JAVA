import java.lang.*;
import java.util.Scanner;

class AddTwoNum{
	//Method definition
	public static int add(int x, int y){
		int sum = x + y;
		return sum;
	}
	
	//Main Method
	public static void main(String args[]){
		int a = 10, b = 20;
		int sum = add(a,b);
		System.out.println("Sum = " + sum);
	}
}