package assignment;
import java.util.PriorityQueue;
public class Priorityque2 {

	public static void main(String[] args) {
		PriorityQueue<String>q1=new PriorityQueue<String>();
		q1.add("Black");
		q1.add("grey");
		q1.add("white");
		q1.add("blue");
		System.out.println(" Queue  Elements are:" +q1);
		q1.offer("green");
		System.out.println("  new Queue  Elements are:" +q1);


	}

}
