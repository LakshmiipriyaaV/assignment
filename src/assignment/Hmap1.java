package assignment;
import java.util.HashMap;
import java.util.Map;

public class Hmap1 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm= new HashMap<Integer,String>();
		hm.put(1,"Black");
		hm.put(2,"grey");
		hm.put(3,"white");
		hm.put(4,"blue");
        for(Map.Entry e:hm.entrySet()) {
        	System.out.println(e.getKey() +"  " + e.getValue());
        }
	}

}
