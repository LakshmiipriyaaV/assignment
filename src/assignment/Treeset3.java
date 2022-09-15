package assignment;

import java.util.Iterator;
import java.util.TreeSet;
public class Treeset3 {

	public static void main(String[] args) {
		TreeSet<String>tree=new TreeSet<String>();
		tree.add("Black");
		tree.add("grey");
		tree.add("white");
		System.out.println("Elements are:" +tree);
		Iterator it=tree.descendingIterator();
		System.out.println("elements are:");
		while(it.hasNext()) {
			System.out.println(it.next()+"");
		}

	}

}
