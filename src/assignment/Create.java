package assignment;
import java.io.File;
public class Create {

	public static void main(String[] args) {
		File fileObj=new File("exa.text");
		try {
			boolean success=fileObj.createNewFile();
			if(success) {
				System.out.println("File got created");
			}
			else {
				System.out.println("File alrady exist");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
