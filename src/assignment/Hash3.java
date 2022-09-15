package assignment;

import java.util.HashSet;

public class Hash3 {

	public static void main(String[] args) {
		HashSet<String>hash1=new HashSet<String>();
		hash1.add("Black");
		hash1.add("grey");
		hash1.add("white");
		hash1.add("blue");
		System.out.println(" First set Elements are:" +hash1);
		HashSet<String>hash2=new HashSet<String>();
		hash2.add("Green");
		hash2.add("red");
		hash2.add("white");
		hash2.add("brown");
		System.out.println(" Second set Elements are:" +hash2);
		hash1.retainAll(hash2);
		System.out.println("hashset content:" +hash1);
	}

}
