package assignment;
import java.util.Scanner;
public class Present {

	public static void main(String[] args) {
		int []arr=new int[10];
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter all 10 numbers");
		for(int i=0;i<10;i++) {
   arr[i]=sc.nextInt();
	}
		System.out.println("Enter a number");
		
		a=sc.nextInt();
		for(int i=0;i<10;i++) {
			if (arr[i]==a) {
				System.out.println("present");
				System.exit(0);
			}
		}
   System.out.println("not present");
}

}