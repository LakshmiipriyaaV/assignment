package assignment;
import java.io.File;
import java.util.Scanner;
public class Reader {

	public static void main(String[] args) {
		try {
			File fileObj=new File("exa.txt");
			Scanner myReader=new Scanner(fileObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
