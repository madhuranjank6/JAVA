// Java Program to demonstrate method overloading

import java.lang.*;

class OverloadingDemo{
	void show(int a){
		System.out.println("Int Parameter");
	}
	
	void show(double a){
		System.out.println("double Parameter");
	}
	
	void show(String a){
		System.out.println("String Parameter");
	}
	
	void show(boolean a){
		System.out.println("Boolean Parameter");
	}
	
	public static void main(String args[]){
		OverloadingDemo d = new OverloadingDemo();
		d.show(10);
		d.show(20.2);
		d.show(true);
	}
}