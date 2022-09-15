package assignment;
//import java.io.IOException;
public class Throw {
  
	static void checkAge(int age)throws
		ArithmeticException{
			if(age<18) {
				throw new ArithmeticException("not allowed to vote,must be 18 ");
			}else {
				System.out.println("Ready to vote");
			}
		}
	
	
	public static void main(String[] args) {
		checkAge(15);
	}

}
