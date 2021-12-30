//Multiplication.java

package maths;

public class Multiplication{
	private int a;
	private int b;
	
	public Multiplication(int x, int y){
		this.a = x;
		this.b = y;
	}
	
	public void mul(){
		System.out.println("Multiplication = "+(a*b));
	}
}