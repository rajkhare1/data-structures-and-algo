package ds.queue;

public class Queue {

	private int maxSize;//initialize the set no. of slots
	private long[] queueArray;// slot to maintain the data
	private int front;// index position of element at front
	private int rear;// index position of element at back of the line
	private int nItems;// counter to maintain the no. of items in our queue
	
	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[maxSize];
		this.front = 0;// index position of the first slot of array
		this.rear = -1;// there is no item in array yet to be considered as last item.
		this.nItems = 0;// we don't have the elements in array yet
	}
	
	public void insert(long j) {
		if(rear == maxSize -1) {
			rear = -1;
		}
		rear++;
		queueArray[rear] = j;
		nItems++;
	}
	
	public long remove() {// remove item from the front of the queue
		long temp = queueArray[front];
		front++;
		if(front == maxSize) {
			front = 0;//reset to front at 0th position so we can utilize the entire array again
		}
		nItems --;
		return temp;
	}
	
	public long peekFront() {
		return queueArray[front];
	}
	
	public boolean isEmpty(){
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	public void view() {
		System.out.print("[ ");
//		for(int i=0; i< queueArray.length; i++) {
//			System.out.print(queueArray[i]+" ");
//		}
		for(long l:queueArray) {
			System.out.print(l+" ");
		}
		System.out.print("]");
	}
}
