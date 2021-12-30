// We can overload only instance methods or static methods or both at a time

import java.lang.*;

class Demo1{
	static void show(int a){
		System.out.println("1 Parameter");
	}
	
	static void show(int a, int b){
		System.out.println("2 Parameter");
	}
	
	void show(int a, int b, int c){
		System.out.println("3 Parameter");
	}
	
	void show(){
		System.out.println("0 Parameter");
	}
}

class Polymorphism1{
	public static void main(String args[]){
		Demo1 d = new Demo1();
		d.show();
		d.show(10);
		d.show(10,20);
		d.show(10,20,30);
	}
}