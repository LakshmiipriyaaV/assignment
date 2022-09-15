package assignment;
class Degree{
	public void getDegree() {
		System.out.println("Got my degree");
	}
}
class Ug extends Degree{
	public void getDegree() {
		System.out.println("Got my Ugdegree");
	}
}
class Pg extends Degree{
	public void getDegree() {
		System.out.println("Got my Pgdegree");
	}
}


public class Grad {

	public static void main(String[] args) {
		Ug a=new Ug();
		Pg b=new Pg();
		a.getDegree();
		b.getDegree();

	}

}
