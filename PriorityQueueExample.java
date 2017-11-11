import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("car");
		queue.add("bike");
		queue.add("bus");
		queue.add("Lorry");
		queue.add("car");
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.poll());
		System.out.println("Iterating the queue elements:");
		Iterator itr=queue.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		queue.remove();
		queue.poll();
		System.out.println("After Iterating two elements");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}
	}
}
