package assignment;
import java.util.Scanner; 
public class A1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[]p = new int[10];
		for(int i=0;i<p.length;i++) {
		System.out.println("Print values of z["+i+"]" );
		p[i]=sc.nextInt();
		
	}
		for(int i=0;i<p.length;i++) {
			System.out.println(" values of z["+i+"] is:" +p[i]);
		}
}
}