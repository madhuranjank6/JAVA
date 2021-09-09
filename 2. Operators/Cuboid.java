import java.lang.*;
import java.util.Scanner;
class Cuboid{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int l,b,h,v,tsa,lsa;
		System.out.println("Enter the length, breadth and height of Cuboid: ");
		l = scan.nextInt();
		b = scan.nextInt();
		h = scan.nextInt();
		
		v = l*b*h;
		lsa = 2*(l+b)*h;
		tsa = 2*((l*b)+(b*h)+(l*h));
		
		System.out.println("Volume = " + v);
		System.out.println("Lateral Surafce Area = " + lsa);
		System.out.println("Total Surface Area = " + tsa);
	}
}