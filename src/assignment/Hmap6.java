package assignment;

import java.util.HashMap;

public class Hmap6 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm1= new HashMap<Integer,String>();
		hm1.put(1,"Black");
		hm1.put(2,"grey");
		hm1.put(3,"white");
		hm1.put(4,"blue");
		System.out.println("Element of map1:" + hm1);
		HashMap<Integer,String>hm2= new HashMap<Integer,String>();
		hm2=(HashMap)hm1.clone();
		System.out.println("Shallow coy of Element of map1:" + hm2);

	}

}
