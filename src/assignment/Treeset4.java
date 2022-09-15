package assignment;
import java.util.Iterator;
import java.util.TreeSet;
public class Treeset4 {

	public static void main(String[] args) {
		TreeSet<String>tree=new TreeSet<String>();
		tree.add("Black");
		tree.add("grey");
		tree.add("white");
		System.out.println("Elements are:" +tree);
		Object fele=tree.first();
		Object lele=tree.last();
		System.out.println(" First Elements are:" +fele);
		System.out.println("Last  Elements are:" +lele);
	}

}
