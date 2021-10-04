package queue;


public class QueueUseArray {

	public static void main(String[] args) {
		QueueUsingArray q = new QueueUsingArray();
		for(int i=1;i<=10;i++) {
			q.enqueue(i);
		}
		q.printQueue();
		
		System.out.println("The deleted element is "+ q.dequeue());
		System.out.println("The front element in queue is " +q.front());
		System.out.println("The rear element in queue is "+q.rear());
		System.out.println("Size of queue is "+q.getSize());
		
		
	}
}
