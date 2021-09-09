import java.lang.*;
class IntegerWidening{
	public static void main(String args[]){
		byte a =  10;
		short b = 140;
		
		int d = a;  //Storing byte type data into int
		int e = b; //Storing short type data into int
		short f = a; //Storing byte type data into short
		long g = a; //Storing byte type data into long
		long h = b; //Storing short type data int long
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}