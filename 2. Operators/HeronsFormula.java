import java.lang.*;
import java.util.Scanner;
class HeronsFormula{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		float a,b,c,s;
		System.out.println("Enter the side a: ");
		a = scan.nextFloat();
		System.out.println("Enter the side b: ");
		b = scan.nextFloat();
		System.out.println("Enter the side c: ");
		c = scan.nextFloat();
		
		s = (a+b+c)/2;
		double area = Math.sqrt(a*(s-a)*(s-b)*(s-c));
		System.out.println("Area = " + area);
	}
}