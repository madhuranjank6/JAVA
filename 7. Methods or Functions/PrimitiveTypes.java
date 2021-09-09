import java.lang.*;

class PrimitiveTypes{
	public static void increase(int x, int y){
		x++;
		y = y + 2;
		System.out.println(x + " : " + y); //x and y are formal Parameters
	}
	
	public static void main(String args[]){
		int a = 10;
		int b = 20;
		increase(a,b);
		System.out.println(a +" : "+b); //a and b are actual parameters
	}
}