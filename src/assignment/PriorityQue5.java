package assignment;

import java.util.PriorityQueue;

public class PriorityQue5 {

	public static void main(String[] args) {
		PriorityQueue<String>q1=new PriorityQueue<String>();
		q1.add("Black");
		q1.add("grey");
		q1.add("white");
		q1.add("blue");
		System.out.println("  queue Elements are:" +q1);
		System.out.println("   First queue Elements are:" +q1.peek());

	}

}
