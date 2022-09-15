package assignment;

import java.util.HashMap;

public class Hmap8 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm1= new HashMap<Integer,String>();
		hm1.put(1,"Black");
		hm1.put(2,"grey");
		hm1.put(3,"white");
		hm1.put(4,"blue");
		System.out.println("Element of map1:" + hm1);
		System.out.println("Does Hashmap contain value \'blue\':");
		if(hm1.containsValue("blue")) {
			System.out.println("Yes,value is present");
			
		}else {
			System.out.println("No,value is not present");
		}
	}

	}


