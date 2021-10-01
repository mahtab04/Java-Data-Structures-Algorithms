package stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		StackUsingArray s1 = new StackUsingArray();
		 for (int i = 20; i >=1; i--) {
		 s1.push(i);
		 }
		 s1.printStack();
		// System.out.println(s1.peekElement());
		// s1.pop();
		// s1.printStack();
		s1.pop();

	}

}
