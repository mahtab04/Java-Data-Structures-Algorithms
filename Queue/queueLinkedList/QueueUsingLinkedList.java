package queueLinkedList;

public class QueueUsingLinkedList<T> {
	private Node<T> front;
	private Node<T> rear;
	int size;

	/**
	 * @param front
	 * @param rear
	 * @param size
	 */
	public QueueUsingLinkedList() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}

	// get the size of the queue
	public int getSize() {
		return size;
	}

	// checks whether the queue is empty or not
	public boolean isEmpty() {
		return size == 0;
	}

	// enqueue method to add element to the queue
	public void enqueue(T data) {
		Node<T> newNode = new Node<T>(data);
		if (front == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}

	// dequeue method to remove element from the queue
	public T dequeue() {
		T data = front.data;
		front = front.next;
		size--;
		return data;
	}

	// peek method to view the front element of the queue
	public T front() {
		return front.data;
	}

	// display method to view the queue
	public void display() {
		System.out.println("Queue is: ");
		Node<T> current = front;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}