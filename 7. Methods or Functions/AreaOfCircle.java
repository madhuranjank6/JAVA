import java.lang.*;
import java.util.Scanner;

class AreaOfCircle{
	//method definition
	public static double area(double radius){
		double area = radius*radius*3.14;
		return area;
	}
	
	//main method
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double r = scan.nextDouble();
		double c = area(r);
		System.out.println("Area = " + c);
	}
}