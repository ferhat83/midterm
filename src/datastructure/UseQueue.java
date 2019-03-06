package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> queue1 = new LinkedList<>();
		queue1.add("chicago");
		queue1.add("new york");
		queue1.add("california");
		queue1.add("texas");
		queue1.add("new jersey");
		System.out.println(queue1);

		queue1.remove("texas");
		queue1.peek();
		((LinkedList<String>) queue1).pollFirst();

		for (String item: queue1) {
			System.out.println(item);
		}

		Iterator<String> itr = queue1.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
