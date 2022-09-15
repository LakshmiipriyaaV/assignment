package assignment;
import java.util.Scanner;
public class Great {

	public static void main(String[] args) {
	int x,y;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter first number");
	x =sc.nextInt();
	System.out.println("Enter second number");
	y =sc.nextInt();
    if(x>y) {
    	System.out.println(" first number is greater");
    	
    }
    else {
    	System.out.println(" second number is greater");	
    }
	}

}
