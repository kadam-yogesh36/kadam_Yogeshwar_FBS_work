package Ds_Queue;

public class TestQueue {

	public static void main(String[] args) {
		QueueA q=new QueueA(5);
		
		q.display();
		q.enqueue(15);
		q.enqueue(50);
		q.enqueue(14);
		System.out.println(q.size);
		q.display();
		
		System.out.println(q.size);
		q.dequeue();
		
		q.display();
		System.out.println(q.size);
		q.dequeue();
		q.display();
		System.out.println(q.size);
		q.dequeue();
		q.display();

	}

}
