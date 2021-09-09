import java.lang.*;
import java.util.Scanner;
class RootsOfQuadratic{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the coefficient of X^2 : ");
		a = scan.nextInt();
		System.out.println("Enter the coefficient of x: ");
		b = scan.nextInt();
		System.out.println("Enter the constant term: ");
		c = scan.nextInt();
		
		double r1 = (-b + Math.sqrt(b*b - 4*(a*c)))/(2*a);  //Because Math.sqrt() returns double type data
		double r2 = (-b - Math.sqrt(b*b - 4*(a*c)))/(2*a);
		
		System.out.println("First root = " + r1);
		System.out.println("Second root = " + r2);
	}
}