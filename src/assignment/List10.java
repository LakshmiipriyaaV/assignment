package assignment;
import java.util.LinkedList;
import java.util.ListIterator;
public class List10 {

	public static void main(String[] args) {
		LinkedList<String>link=new LinkedList<String>();
		link.add("lp");
		link.add("panda");
		link.add("priya");	
		System.out.println(" Elements are:" +link);
		Object firstele = link.getFirst() ;
		Object lasttele = link.getLast() ;
		System.out.println("  First Elements ele:" +firstele);
		System.out.println("  Last Elements ele:" +lasttele);
		

	}

}
