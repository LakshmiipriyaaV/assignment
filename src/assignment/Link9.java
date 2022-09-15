package assignment;
import java.util.LinkedList;
import java.util.ListIterator;
public class Link9 {

	public static void main(String[] args) {
		LinkedList<String>link=new LinkedList<String>();
		link.add("lp");
		link.add("panda");
		link.add("priya");	
		System.out.println(" Before changes:" +link);
		LinkedList<String>newlink=new LinkedList<String>();
		newlink.add("lakshmi");
		newlink.add("lakshh");
			link.addAll(1,newlink);
		System.out.println(" after changes:" +link);
		
	}

}
