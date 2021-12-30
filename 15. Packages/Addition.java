// Addition.java

package maths;

public class Addition{
	private int a;
	private int b;
	
	public Addition(int x, int y){
		this.a = x;
		this.b = y;
	}
	
	public void add(){
		System.out.println("Addition = "+(a+b));
	}
}