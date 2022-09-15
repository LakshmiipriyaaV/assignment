package assignment;

public class Null1 {
    private static void printLength(String s) {
    	System.out.println(s.length());
    }
	public static void main(String[] args) {
		String myStr = null;
		printLength(myStr);

	}

}
