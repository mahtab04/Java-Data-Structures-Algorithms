package stack;

public class StackUsingArray {
	private int data[];
	private int top;

	public StackUsingArray() {
		top = -1;
		data = new int[10];
	}

	// Resize the stack if it is full
	private void doubleCapacity() {
		int temp[] = data;
		data = new int[temp.length * 2];
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}

	}

	// Checks if stack is empty or not
	public boolean isEmpty() {
		return top == -1;
	}
	// Checks if stack is full or not

	public boolean isFull() {
		return top == data.length - 1;
	}
	// returns the size of stack

	public int size() {
		return top + 1;
	}

	// Push an element into the top of stack;
	public void push(int x) {
		if (isFull()) {
			doubleCapacity();
		}
		data[++top] = x;

	}

	// Remove an element from the stack
	public int pop() throws StackEmptyException {
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		return data[top--];
	}

	// Returns the top element of satck
	public int peekElement() throws StackEmptyException {
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		return data[top];
	}

	// Print the element of stack
	public void printStack() {
		for (int i = top; i >= 0; i--)
			System.out.print(data[i] + " ");
		System.out.println();
	}
}
