package assignment;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class Write {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("exa.txt");
			myWriter.write("Helloo!!");
			myWriter.write("Helloo ppl!!!");
			myWriter.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
