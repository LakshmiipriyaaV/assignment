package assignment;
import java.util.HashMap;
import java.util.Map;
public class Hmap2 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm= new HashMap<Integer,String>();
		hm.put(1,"Black");
		hm.put(2,"grey");
		hm.put(3,"white");
		hm.put(4,"blue");
		System.out.println("Element of map" + hm);
		System.out.println(" Size of Element of map:  " + hm.size());

	}

}
