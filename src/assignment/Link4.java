package assignment;
import java.util.LinkedList;
import java.util.ListIterator;
public class Link4 {

	public static void main(String[] args) {
		LinkedList<String>link=new LinkedList<String>();
		link.add("lp");
		link.add("panda");
		link.add("priya");
		ListIterator lt=link.listIterator(link.size());
		System.out.println("elements are:");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous()+"");
		}

	}

}
