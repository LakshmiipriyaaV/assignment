package assignment;
import java.util.LinkedList;
import java.util.ListIterator;
public class List11 {

	public static void main(String[] args) {
		LinkedList<String>link=new LinkedList<String>();
		link.add("lp");
		link.add("panda");
		link.add("priya");	
		System.out.println(" Elements are:" +link);
		link.remove(1);
		System.out.println("  After removing Elements are:" +link);

	}

}
