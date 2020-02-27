package ds.stack;

public class App {

	public static void main(String[] args) {
		Stack theStack = new Stack(2);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);

		while (!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println(value);
		}

		System.out.println(reverseString("SIA"));
	}

	public static String reverseString(String str) {
		int size = str.length();
		Stack2 strStack = new Stack2(size);

		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			strStack.push(c);
		}

		String result = "";
		while (!strStack.isEmpty()) {
			char pop = strStack.pop();
			result = result + pop;// appending to the output
		}
		return result;
	}

}
