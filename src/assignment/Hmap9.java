package assignment;

import java.util.HashMap;
import java.util.Set;

public class Hmap9 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm1= new HashMap<Integer,String>();
		hm1.put(1,"Black");
		hm1.put(2,"grey");
		hm1.put(3,"white");
		hm1.put(4,"blue");
		System.out.println("Element of map1:" + hm1);
		Set set=hm1.entrySet();
		System.out.println("Set view:" + set);

	}

}
