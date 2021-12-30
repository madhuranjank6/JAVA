// Java Pogram to demonstrate nested Try Catch block

import java.lang.*;

class NestedTryCatch{
	public static void main(String args[]){
		int A[] = {30, 20, 10, 40, 0};
		
		try{
			int c = A[0]/A[2];
			System.out.println("Division = " + c);
			try{
				System.out.println(A[5]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Invalid Index");
				System.out.println(e);
			}
		}
		catch(ArithmeticException ae){
			System.out.println("Denominator Should not be Zero");
			System.out.println(ae);
		}
	}
}