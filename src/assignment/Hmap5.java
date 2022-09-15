package assignment;

import java.util.HashMap;

public class Hmap5 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm1= new HashMap<Integer,String>();
		hm1.put(1,"Black");
		hm1.put(2,"grey");
		hm1.put(3,"white");
		hm1.put(4,"blue");
		boolean result=hm1.isEmpty();
		System.out.println("Element of map1:" + hm1);
		hm1.clear();
		 result=hm1.isEmpty();
		System.out.println("Element of map1:" + hm1);

	}

}
