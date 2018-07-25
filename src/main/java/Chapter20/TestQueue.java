package Chapter20;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("武汉");
		queue.offer("重庆");
		queue.offer("北京");
		queue.offer("杭州");
		queue.offer("深圳");

		while (queue.size() > 0)
			System.out.println(queue.remove() + " ");
	}
}
