package assignment;
abstract class Ani{
public  abstract void printSound();
public   void displayInfo() {
System.out.println("Im a animal");
}
}
class Dog extends Ani{
	public void printSound() {
	System.out.println("dog barks");
	}
}
class Cat extends Ani{
	public   void printSound() {
	System.out.println("cat meow");
	}
}
public class Animal {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c= new Cat();	
		d.printSound();
		d.displayInfo();
		c.printSound();
		c.displayInfo();

	}

}
