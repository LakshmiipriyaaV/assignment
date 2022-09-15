package assignment;
class I{
	int i;
	public void printNum() {
		System.out.println(i);
	}
}
class J  extends I{
	int j;
	public void printNum() {
		System.out.println(j);
	}
}
public class Ijj {

	public static void main(String[] args) {
		J a =new J();
		a.i=10;
		a.j=15;
		a.j=a.i;
		a.printNum();
		

	}

}
