package assignment;

import java.util.HashSet;
import java.util.PriorityQueue;
public class Priorityque4 {

	public static void main(String[] args) {
		PriorityQueue<String>q1=new PriorityQueue<String>();
		q1.add("Black");
		q1.add("grey");
		q1.add("white");
		q1.add("blue");
		System.out.println(" First queue Elements are:" +q1);
		PriorityQueue<String>q2=new PriorityQueue<String>();
		q2.add("Green");
		q2.add("red");
		q2.add("white");
		q2.add("brown");
		System.out.println(" Second set Elements are:" +q2);
		q1.retainAll(q2);
		System.out.println("Queue content:" +q1);

	}

}
