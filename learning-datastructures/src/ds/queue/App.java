package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.insert(200);
		queue.insert(100);
		queue.insert(29);
		queue.insert(400);
		queue.insert(15);
		
		queue.view();

	}

}
