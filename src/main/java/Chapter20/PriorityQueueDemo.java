package Chapter20;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> queue1 = new PriorityQueue<>();
		queue1.offer("武汉");
		queue1.offer("重庆");
		queue1.offer("北京");
		queue1.offer("杭州");
		queue1.offer("深圳");

		System.out.println("Priority queue using Comparable:");
		while(queue1.size() > 0){
			System.out.println(queue1.remove() + " ");
		}

		PriorityQueue<String> queue2 = new PriorityQueue(4, Collections.reverseOrder());
		queue2.offer("武汉");
		queue2.offer("重庆");
		queue2.offer("北京");
		queue2.offer("杭州");
		queue2.offer("深圳");

		System.out.println("\nPriority queue using Comparable:");
		while(queue2.size() > 0){
			System.out.println(queue2.remove() + " ");
		}
	}

}
