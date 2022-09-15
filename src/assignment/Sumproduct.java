package assignment;
import java.util.Scanner;
public class Sumproduct {

	public static void main(String[] args) {
		int a[],sum=0,pdt=1,num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of array");
		num= sc.nextInt();
		a=new int[num];
		for(int i=0;i<num;i++) {
		System.out.println("Enter array element:"+(i+1));
		a[i]= sc.nextInt();
	}
		for(int i=0;i<num;i++) {
			sum= sum+a[i];
			pdt=pdt*a[i];
			
		}
		System.out.println("Sum is:" +sum);
		System.out.println("Product is:" +pdt);
}
}