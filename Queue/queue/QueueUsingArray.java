package queue;

public class QueueUsingArray {
    private int data[];
    private int front;
    private int rear;
    int size;

    public QueueUsingArray() {
        this.data = new int[10];
        this.front = -1;
        this.rear = -1;
        this.size = 0;

    }

    public QueueUsingArray(int capacity) {
        this.data = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;

    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[data.length * 2];
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index++] = temp[i];
        }
        for (int i = 0; i < front - 1; i++) {
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length - 1;

    }

    // Get the size of queue
    public int getSize() {
        return size;
    }

    // Checks whether the queue is empty or not
    public boolean isEmpty() {
        return size == 0;
    }

    // Checks whether the queue is full or not
    public boolean isFull() {
        return size == data.length;

    }

    // Adds an item to the queue
    public void enqueue(int element) {
        if (isFull()) {
            doubleCapacity();
        }
        if (isEmpty()) {
            front = 0;
        }
        rear++;
        data[rear] = element;
        size++;
    }

    // Delete an element from queue;
    public int dequeue() {
        if (isEmpty())
            return -1;
        int ans = data[front];
        front++;
        size--;
        if (front == rear || size == 0) {
            front = -1;
            rear = -1;
        }
        return ans;
    }

    // print the elements of queue
    public void printQueue() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Returns front of queue
    public int front() {
        if (isEmpty())
            return -1;
        return data[front];
    }

    // Returns rear of queue
    public int rear() {
        if (isEmpty())
            return -1;
        return data[rear];

    }
}
