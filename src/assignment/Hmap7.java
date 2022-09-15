package assignment;

import java.util.HashMap;

public class Hmap7 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm1= new HashMap<Integer,String>();
		hm1.put(1,"Black");
		hm1.put(2,"grey");
		hm1.put(3,"white");
		hm1.put(4,"blue");
		System.out.println("Element of map1:" + hm1);
		System.out.println("Does Hashmap contain key1:");
		if(hm1.containsKey(5)) {
			System.out.println("Yes,key is present");
			
		}else {
			System.out.println("No,key is not present");
		}
	}

}
