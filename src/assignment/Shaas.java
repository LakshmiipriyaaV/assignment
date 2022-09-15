package assignment;
class Shap{
	public void print_shape() {
		System.out.println("This is a shape");
	}
}
class Rec extends Shap{
	public void print_rect() {
		System.out.println("This is a rectangular  shape");
	}
}
class Cir extends Shap{
	public void print_circ() {
		System.out.println("This is a circular  shape");
	}
}
class Sq extends Rec{
	public void print_squ() {
		System.out.println("Square is rectangle");
	}
}

public class Shaas {

	public static void main(String[] args) {
		Sq sqr = new Sq();
		sqr.print_shape();
		sqr.print_rect();

	}

}

