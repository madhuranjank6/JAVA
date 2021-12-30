// Student details program to demonstrate Constructors

import java.lang.*;

class Student{
	int roll;
	String name;
	double fees;
	
	/* 0-Parameterized Constructor */
	Student(){
		roll = 1;
		name = "Madhuranjan";
		fees = 1200.00;
	}
	
	/* Parameterized constructor */
	Student(int rno, String nm, double fe){
		roll = rno;
		name = nm;
		fees = fe;
	}
	
	/* Normal Display Method */
	void display(){
		System.out.println(roll+"\t"+name+"\t"+fees);
	}
}

class StudentDetails{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.display();
		
		Student s2 = new Student();
		s2.display();
		
		Student s3 = new Student(2,"Manika",1300);
		s3.display();
		
		Student s4 = new Student(4,"Varsha",1500);
		s4.display();
	}
}