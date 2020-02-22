package ds.stack;

public class Stack2 {
	
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack2(int size) {
		this.maxSize =  size;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}
	
	public void push(char value) {
		if(!isFull()) {
		top++;
		stackArray[top] = value;
		} else {
			System.out.println("Cannot insert data stack is already full!");
		}

	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty cannot remove the element!!!");
			return '0';
			
		} else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
		
	}
	
	public char  peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (maxSize-1 ==top);
	}
	

}
