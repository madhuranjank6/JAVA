import java.lang.*;
class FlagWidthPrecision{
	public static void main(String args[]){
		float a = 3.45f;
		float b = -3.45f;
		
		System.out.printf("a = %f, b = %f\n", a, b);
		System.out.printf("a = %6f, b = %6f\n", a, b); // width = 6
		System.out.printf("a = %6.2f, b = %6.2f\n", a, b); // width = 6, precision = .2
		System.out.printf("a = %06.2f, b = %06.2f\n", a, b); // flag = 0, Width =6, precision = .2
		System.out.printf("a = %+6.2f, b = %+6.2f\n", a, b); // flag = +, Width =6, precision = .2
		System.out.printf("a = %-6.2f, b = %-6.2f\n", a, b); // flag = -, Width =6, precision = .2
		System.out.printf("a = %(6.2f, b = %(6.2f\n", a, b); // flag = (, Width =6, precision = .2
	}
}