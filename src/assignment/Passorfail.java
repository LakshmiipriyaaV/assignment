package assignment;
import java.util.Scanner;

public class Passorfail {

	public static void main(String[] args) {
		
		int i;
		
		Scanner sc= new Scanner(System.in);
		
			System.out.println("Enter score");
			i = sc.nextInt();
			if(i>=80) {
				System.out.println("Distintion");
			}
			else if(i>=40 && i<=80){
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
		}

	}


