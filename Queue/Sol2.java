class InputRestrictedDeque {
    private int[] arr;    
    private int front;    
    private int rear;     
    private int size;     
    private int capacity; 

    // Constructor to initialize the deque
    public InputRestrictedDeque(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    // Check if the deque is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Add an element to the rear
    public void addLast(int value) {
        if (isFull()) {
            throw new IllegalStateException("Deque is full");
        }
        if (front == -1) { 
            front = 0;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }

    // Remove an element from the front
    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        int value = arr[front];
        if (front == rear) { 
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return value;
    }

    // Remove an element from the rear
    public int removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        int value = arr[rear];
        if (front == rear) { // Single element case
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear--;
        }
        size--;
        return value;
    }

    // Get the element at the front
    public int peekFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return arr[front];
    }

    // Get the element at the rear
    public int peekLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return arr[rear];
    }
}

class Client {
    public static void main(String[] args) {
        InputRestrictedDeque deque = new InputRestrictedDeque(5);

        // Adding elements
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);

        System.out.println("Front element: " + deque.peekFirst()); 
        System.out.println("Rear element: " + deque.peekLast());   

        // Removing elements
        System.out.println("Removed from front: " + deque.removeFirst()); 
        System.out.println("Removed from rear: " + deque.removeLast());   

        // Checking if deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty()); 
    }
}
