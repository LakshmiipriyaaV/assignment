package assignment;
import java.util.Iterator;
import java.util.TreeSet;
public class Treeset5 {

	public static void main(String[] args) {
		TreeSet<Integer>treenum=new TreeSet<Integer>();
		TreeSet<Integer>treehset=new TreeSet<Integer>();
		treenum.add(1);
		treenum.add(6);
		treenum.add(5);
		treenum.add(8);
		treenum.add(7);
		treehset =(TreeSet)treenum.headSet(7);
		Iterator  iterator;
		iterator=treehset.iterator();
		System.out.println("Data:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"");
		}
		

	}

}
