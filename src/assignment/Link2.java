package assignment;

import java.util.LinkedList;
import java.util.ListIterator;

public class Link2 {

	public static void main(String[] args) {
		LinkedList<String>link=new LinkedList<String>();
		link.add("lp");
		link.add("panda");
		link.add("priya");
		ListIterator lt=link.listIterator();
		System.out.println("elements are:");
		while(lt.hasNext()) {
			System.out.println(lt.next()+"");
		}


	}

}
