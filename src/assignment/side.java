package assignment;
class Area{
	public void are(int x) {
		System.out.println("area of square:"+(x*x));
	}
	public void are(int x,int y) {
		System.out.println("area of rectangle:"+(x*y));
	}
}
public class side {

	public static void main(String[] args) {
		Area x= new Area();
		x.are(4,5);
		x.are(4);
	}

}
