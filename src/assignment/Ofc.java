package assignment;

 class Ofc {
       String name;
       int age;
       String number;
       String adress;
       int salary;
       public void printSalary() {
    	   System.out.println(salary);
       }
}
class Employee extends Ofc{
	String specialization;
}
class Manager extends  Ofc{
	String department;
}

  class Member{
	public static void main( String[]args) {
		Employee e=new Employee();
		e.name ="priii";
		e.age = 23;
		e.number = "9876543211";
		e.adress = "wertyu";
		e.salary = 20000;
		e.specialization = "werty";
		
		Manager m=new Manager();
		m.name ="riii";
		m.age = 23;
		m.number = "9873543211";
		m.adress = "weyutyu";
		m.salary = 50000;
		
		
		
		
	}
}
 