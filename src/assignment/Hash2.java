package assignment;
import java.util.HashSet;

public class Hash2 {

	public static void main(String[] args) {
		HashSet<String>hash=new HashSet<String>();
		hash.add("Black");
		hash.add("grey");
		hash.add("white");
		hash.add("blue");
		System.out.println("Elements are:" +hash);
		HashSet<String>hashnew=new HashSet<String>();
		hashnew =(HashSet)hash.clone();
		System.out.println(" After clone Elements are:" +hashnew);

	}

}
