class NarrowingAndWidening{
	public static void main(String args[]){
		byte a = 10;
		short b = 200;
		int c = 10000;
		float d = 12.5f;
		
		int e = a ; //No error, Variable Widening
		int f = b ; //No error, Variable Widening
		float g = a; //No error, Variable widening
		float h = c; //No error, Variable widening
		
		// byte i = c; //Error, Lossy Conversion
		byte i = (byte)c; //Data Loss
		int j = (int)d; //Data loss
		
		
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
	}
}