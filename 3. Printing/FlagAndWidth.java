import java.lang.*;
class FlagAndWidth{
	public static void main(String args[]){
		int a = 10;
		int b = -10;
		
		System.out.printf("a = %d, b = %d\n",a,b);
		System.out.printf("a = %5d, b = %5d\n",a,b); //width = 5
		System.out.printf("a = %05d, b = %05d\n", a,b); //flag = 0, width = 5
		System.out.printf("a = %+5d, b = %+5d\n", a,b); //flag = +, width = 5
		System.out.printf("a = %-5d, b = %-5d\n", a,b); //flag = -, width = 5
		System.out.printf("a = %(5d, b = %(5d\n", a,b); //flag = (, width = 5
		
	}
}