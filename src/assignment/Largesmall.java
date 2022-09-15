package assignment;

public class Largesmall {

	public static void main(String[] args) {
		
int n[]= new int[] {1,6,2,3,12,4,5,0,11,};
    int s=n[0];
    int l=n[0];
    for(int i=0;i<n.length;i++) {
    	if(n[i]>l) {
    		l=n[i];
            
    }
    	else if(n[i]< s){
    		s=n[i];
    	}
    	System.out.println("largeest no is:" +l);
    	System.out.println("smallest no is:" +s);
}
	}
}
