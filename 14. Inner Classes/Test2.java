// Accessing the members of outer class inside the inner class

class Outer4{
	int x = 10;
	static int y = 20;
	String str = "Outer";
	
	class Inner4{
		String str = "Inner";
		void innerMethod(){
			System.out.println("Inner class Method");
			System.out.println("X = "+x);
			System.out.println("Y = "+y);
			outerMethod();
		}
		
		void innerMethod1(String str){
			System.out.println("Str = "+str);
			System.out.println("Str = "+this.str);
			System.out.println("Str = "+Outer4.this.str);
		}
	}
	
	void outerMethod(){
		System.out.println("Outer Class Method");
	}
}

class Test2{
	public static void main(String args[]){
		Outer4 o = new Outer4();
		Outer4.Inner4 i = o.new Inner4();
		i.innerMethod();
		i.innerMethod1("Local");
	}
}