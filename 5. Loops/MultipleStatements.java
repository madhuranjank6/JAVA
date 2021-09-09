// Multiple Statements inside for loop

//We can initialize multiple variables, have multiple conditions and multiple update statements inside for loop
//We can seperate multiple statements using comma, but not for conditions. Conditions must to be combined using logical // Operatots


import java.lang.*;
class MultipleStatements{
	public static void main(String args[]){
		for(int i=0,j=4; i<5 && j>=0; i++,j--){
			System.out.println(i+" "+j);
		}
	}
}