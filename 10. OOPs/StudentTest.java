import java.lang.*;

class Student{
	public int roll;
	public String name;
	public String course;
	public int m1,m2,m3;
	
	//Method to calculate total marks
	public int total(){
		return m1+m2+m3;
	}
	
	//Method to calculate the average
	public float average(){
		return (float)total()/3;
	}
	
	//Method to display the details of the class
	public String toString(){
		return "Roll. no. : " +roll +"\n"+"Name: "+name;
	}
	
}

class StudentTest{
	public static void main(String args[]){
		Student s = new Student(); //Object of Student class
		
		//Accesing and assigning the values to the properties of the Student class
		s.roll = 1;
		s.name = "Madhuranjan";
		s.course = "CSE";
		s.m1 = 60;
		s.m2 = 70;
		s.m3 = 85;
		
		System.out.println("Details : "+"\n" + s);
		System.out.println("Total Marks = " + s.total());
		System.out.println("Average Marks = " + s.average());
	}
}