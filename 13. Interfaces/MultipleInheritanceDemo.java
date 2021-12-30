// Multiple inheritance using Interfaces

import java.lang.*;

interface Calc1{
	void add(int x, int y);
	void sub(int x , int y);
	void mul(int x, int y);
}

interface Calc2{
	void sub(int x , int y);
}


interface Calc3{
	void mul(int x, int y);
}

interface Calc4{
	void div(int x, int y);
}

class Calculator implements Calc1, Calc2, Calc3, Calc4{
	public void add(int a, int b){
		System.out.println("Addition : "+(a+b));
	}
	
	public void sub(int a, int b){
		System.out.println("Subtraction : " + (a-b));
	}
	
	public void mul(int a, int b){
		System.out.println("Multiplication : "+(a*b));
	}
	
	public void div(int a, int b){
		System.out.println("Division : "+(a/b));
	}
}


class MultipleInheritanceDemo{
	public static void main(String args[]){
		Calculator c = new Calculator();
		c.add(20,10);
		c.sub(30,20);
		c.mul(10,5);
		c.div(80,4);
	}
}