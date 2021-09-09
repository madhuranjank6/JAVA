class Increment{
	public static void main(String args[]){
		int x = 5;
		int y,z;
		y = x++ ; //First x is assigned to y and then incremented
		z = ++x; //First x is incremented and then it is assigned to z
		
		System.out.println(y);
		System.out.println(z);
	}
}