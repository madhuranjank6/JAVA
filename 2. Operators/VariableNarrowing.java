import java.lang.*;
class VariableNarrowing{
	public static void main(String args[]){
		int a = 500;
		long b = 100000L;
		
		byte c = (byte)a; //Data Loss as Integer is larger than byte
		short d = (short)a; //Narrowing without data loss
		int e = (int)(b); //Narrowing without data loss
		byte f = (byte)b; //Data Loss as long is larger than byte
		short g = (short)b; //Data Loss as long is larger than short
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}