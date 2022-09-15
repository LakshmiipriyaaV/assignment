package assignment;

import java.util.HashMap;

public class Hmap3 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm1= new HashMap<Integer,String>();
		hm1.put(1,"Black");
		hm1.put(2,"grey");
		hm1.put(3,"white");
		hm1.put(4,"blue");
		System.out.println("Element of map1:" + hm1);
		
		HashMap<Integer,String>hm2= new HashMap<Integer,String>();
		hm2.put(5,"red");
		hm2.put(6,"orange");
		hm2.put(7,"green");
		hm2.put(8,"maroon");
		System.out.println("Element of map2:" + hm2);
		
		hm2.putAll(hm1);
		System.out.println(" Now the Element of map2:" + hm2);
		

	}

}
