package Ds_Queue;

public class CircularQueueTest {

	public static void main(String[] args) throws Exception {
		CircularQueue cq=new CircularQueue(5);
		
		cq.display();
		cq.enqueue(1);
		
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.enqueue(5);
		cq.display();
		cq.dequeue();
		cq.display();
		cq.enqueue(6);
		cq.display();
		cq.enqueue(7);
		
		
		

	}

}
