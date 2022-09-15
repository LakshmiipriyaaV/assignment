package assignment;

public class Print {

	public static void main(String[] args) {
		Print obj = new Print();
		obj.printn(10,'A');
		obj.printn('B',18);
		
		
	}
	void printn(int a,char c) {
		System.out.println("Integer is" +a+"\t character is"+c);
	}
	void printn(char c,int a) {
		System.out.println("Character is" +c+ "\t integer  is" +a);
	}
}
