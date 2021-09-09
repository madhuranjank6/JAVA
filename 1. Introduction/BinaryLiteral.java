import java.lang.*;

class BinaryLiteral{
	public static void main(String args[]){
		byte a = 10; //Decimal int literal
		byte b = 0b1010; //Binary int literal
		byte c = 012; //Octal int literal
		byte d = 0XA; //Hexadecimal int literal
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}