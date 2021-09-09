import java.lang.*;
class BinaryAndOrXor{
	public static void main(String args[]){
		int x = 0b1010; //10
		int y = 0b0110; //6
		int and,or,xor;
		
		and = x&y; //2
		or = x|y; //14
		xor = x^y; //12
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(xor);
		
		System.out.println(Integer.toBinaryString(and));
		System.out.println(Integer.toBinaryString(or));
		System.out.println(Integer.toBinaryString(xor));
	}
}