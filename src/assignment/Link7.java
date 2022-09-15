package assignment;
import java.util.LinkedList;
import java.util.ListIterator;

public class Link7 {

	public static void main(String[] args) {
		LinkedList<String>link=new LinkedList<String>();
		link.add("lp");
		link.add("panda");
		link.add("priya");	
		System.out.println("Before adding:" +link);
        link.addFirst("lakshmi");
        System.out.println("After adding:" +link);
	}

}
