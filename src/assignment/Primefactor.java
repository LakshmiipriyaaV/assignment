package assignment;
import java.util.Scanner;
public class Primefactor {

	public static void main(String[] args) {
	 int a,b,i,j,k,f=0;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter n");
		 a=sc.nextInt();
	 for(k=1;k<=a;k++) {
        if(a %k==0) {
        	b=k/2;
        	i=2;
        	f=0;
        	while(i<=b) {
        		if(k%i==0) {
        			f++;
        			
        		}
        		i++;
        		
        	}if(f==0) {
        		System.out.println(k);
        	}
        	sc.close();
        }
	}

	}
}
