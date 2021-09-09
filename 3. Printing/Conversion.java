import java.lang.*;
class Conversion{
	public static void main(String args[]){
		int x = 10;
		float y = 12.5f;
		char z = 'A';
		
		System.out.printf("%d %o %x",x,x,x);
		System.out.printf("\n%f %e %g",y,y,y);
		System.out.printf("\n%c",z);
	}
}