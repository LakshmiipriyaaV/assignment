package assignment;
class Student{
	String name,adress;
	int age;
	Student()
	{
		name="unknown";
		age=0;
		adress="not available";
	}
	public void setInfo(String a,int b) {
		name=a;
		age=b;
		
	}
	public void setInfo(String a,int b,String c) {
		name=a;
		age=b;
		adress=c;
		System.out.println(name+" " +age+" " +adress);
		
	}
}
public class Stud {

	public static void main(String[] args) {
		Student[] s=new Student[10];
		s[0]=new Student();
		s[0].setInfo("lakshmi", 4,"ooty");
		s[1]=new Student();
		s[1].setInfo("priya", 7,"mysore");

	}

}
