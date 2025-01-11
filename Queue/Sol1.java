class Deque {
    private int[] arr;    
    private int front;    
    private int rear;     
    private int size;     
    private int capacity; 

    public Deque(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = -1;
        this.rear = 0;
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
        if (front == -1) { 
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

    
    public int removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        int value = arr[rear];
        if (front == rear) { 
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
        Deque deque = new Deque(5);

        
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        
        System.out.println("Front: " + deque.peekFirst());
        System.out.println("Rear: " + deque.peekLast());   

        
        System.out.println("Removed from front: " + deque.removeFirst()); 
        System.out.println("Removed from rear: " + deque.removeLast());   

        
        System.out.println("Is empty? " + deque.isEmpty()); 
    }
}
