package assignment;
import java.util.LinkedList;
import java.util.ListIterator;
public class Link5 {

	public static void main(String[] args) {
		LinkedList<String>link=new LinkedList<String>();
		link.add("lp");
		link.add("panda");
		link.add("priya");		
		link.add(1,"lakshmi");
		ListIterator lt=link.listIterator();
		System.out.println("elements are:");
		while(lt.hasNext()) {
			System.out.println(lt.next()+"");
		}
	}

}
