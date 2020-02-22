package adt;

public class CounterRunner {

	public static void main(String[] args) {
		Counter counter1 = new Counter("Counter 1");
		counter1.increment();
		counter1.increment();
		counter1.increment();
		counter1.increment();
		System.out.println(counter1.getCurrentValue());
		System.out.println(counter1);
	}
}
