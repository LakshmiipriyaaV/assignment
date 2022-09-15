package assignment;
abstract class Parent{
	void message() {}
}
class Subclass1 extends Parent{
	void message() {
		System.out.println("First Subclass");
	}
}
class Subclass2 extends Parent{
	void message() {
		System.out.println("Second Subclass");
	}
}
public class Message {

	public static void main(String[] args) {
		Subclass1 sb1 =new Subclass1();
		Subclass2 sb2 =new Subclass2();
		sb1.message();
		sb2.message();

	}

}
