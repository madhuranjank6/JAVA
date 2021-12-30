// main() method Overloading

import java.lang.*;

class Polymorphism3{

	public static void main(int ar[]){
		System.out.println("Main Method with int[] parameter");
	}
	
	public static void main(double ars[]){
		System.out.println("Main Method with double[] parameter");
	}
	
	public static void main(int a){
		System.out.println("Main Method with int parameter");
	}
	
	public static void main(boolean b){
		System.out.println("Main Method with boolean parameter");
	}
	
	public static void main(String args[]){
		System.out.println("Main Method with String args[] parameter");
		Polymorphism3.main(80);
		Polymorphism3.main(true);
		int[] arr = {10,20};
		Polymorphism3.main(arr);
		double[] darr = {10.2,15.6};
		Polymorphism3.main(darr);
	}
}