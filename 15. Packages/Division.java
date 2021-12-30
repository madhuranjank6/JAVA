//Division.java

package maths;

public class Division{
	private int a;
	private int b;
	
	public Division(int x, int y){
		this.a = x;
		this.b = y;
	}
	
	public void div(){
		System.out.println("Division = "+(a/b));
	}
}