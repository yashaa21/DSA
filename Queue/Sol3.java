class OutputRestricted {
    int[] arr;    
    int front;    
    int rear;     
    int size;     
    int capacity; 

    public OutputRestricted(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int value) {
        if (isFull()) {
            throw new IllegalStateException("Deque is full");
        }
        if (front == -1) { 
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front--;
        }
        arr[front] = value;
        size++;
    }

    public void addLast(int value) {
        if (isFull()) {
            throw new IllegalStateException("Deque is full");
        }
        if (rear == -1) { 
            front = 0;
            rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = value;
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        int value = arr[front];
        if (front == rear) { 
            front = -1;
            rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
        return value;
    }

    public int peekFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return arr[front];
    }

    public int peekLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return arr[rear];
    }
}

class Client {
    public static void main(String[] args) {
        OutputRestricted deque = new OutputRestricted(5);

        deque.addFirst(10);
        deque.addLast(20);
        deque.addLast(30);

        System.out.println("Front element: " + deque.peekFirst()); 
        System.out.println("Rear element: " + deque.peekLast());   

        System.out.println("Removed from front: " + deque.removeFirst()); 
        System.out.println("Front element after removal: " + deque.peekFirst()); 

        System.out.println("Is deque empty? " + deque.isEmpty()); 
    }
}
