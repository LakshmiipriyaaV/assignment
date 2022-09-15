package assignment;
 class A {
    public void pmethod() {
    	System.out.println("This is parent class");
    }
}
class  B extends A{
	public void cmethod() {
		System.out.println("This is child class");	
	}
}

public class Demoin {

	public static void main(String[] args) {
		A m = new A();
		   B n =new B();
		   m.pmethod();
		   n.cmethod();
		  	

	}

}
