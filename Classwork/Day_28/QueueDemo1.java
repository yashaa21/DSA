import java.util.*;

class QueueDemo{

	public static void main(String[] args){
	
		Queue q = new PriorityQueue();
		
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		
		System.out.println(q);
		
		System.out.println("Peek Method output : " + q.peek());
		
		System.out.println(q.poll() + " is popped");
		System.out.println("Peek Method output : " + q.peek());
		System.out.println(q);
		
		System.out.println(q.poll()+ " is popped");
		System.out.println(q);
		System.out.println(q.poll() + " is popped");
		System.out.println(q);
		System.out.println(q.poll()+ " is popped");		
		System.out.println(q);
		
		
		
	}
}