package assignment;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age");
		age= sc.nextInt();
        if(age>=18) {
        	System.out.println("Eligible candidate to vote");
	}
        else {
        	System.out.println(" Not a Eligible candidate to vote");
}
}
}