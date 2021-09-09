import java.lang.*;
import java.util.Scanner;
class AreaOfTriangle{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base: ");
		float base = scan.nextFloat();
		System.out.println("Enter the height: ");
		float height = scan.nextFloat();
		
		float Area = (1f/2f)*base*height; //1 and 2 are bydefault int so we need to typecast it
		
		System.out.println("Area = " + Area);
	}
}