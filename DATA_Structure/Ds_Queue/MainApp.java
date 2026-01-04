package Ds_Queue;

public class MainApp {
	public static void main(String[] args) {
		MyQueue mq=new MyQueue(5);
		
		mq.enqueue(10);
		mq.enqueue(100);
		mq.enqueue(45);
		mq.enqueue(5);
		mq.enqueue(50);
		
		mq.display();
		mq.dequeue();
		mq.display();
		mq.enqueue(4500);
		mq.display();
		mq.enqueue(45);
		
		
	}

}
