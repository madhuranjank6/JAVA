// Java Program to demonstarte constructor Overloading

import java.lang.*;

class Cube{
	int l,b,h;
	Cube(){
		l=b=h=5;
	}
	
	Cube(int x){
		l=b=h=x;
	}
	
	Cube(int l, int b, int h){
		this.l = l;
		this.b = b;
		this.h = h;
	}
	
	int area(){return l*b*h;}
}

class ConstructorOverloading{
	public static void main(String args[]){
		Cube c1 = new Cube();
		System.out.println(c1.area());
		Cube c2 = new Cube(7);
		System.out.println(c2.area());
		Cube c3 = new Cube(2,5,4);
		System.out.println(c3.area());
	}
}