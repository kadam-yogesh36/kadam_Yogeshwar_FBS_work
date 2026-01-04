package Ds_Queue;

public class QueueA {
	int front;
	int rear;
	int size;
	
	int [] arr;

	/**
	 * 
	 */
	public QueueA(int size) {
		
		arr=new int[size];
		front=-1;
		rear=-1;
		size=0;
		
		
		
	}
	
	
	
	public boolean isEmpty(){
		
		if(rear==-1) {
			return true;
		}
		else
			return false;
		
	}
	
	public boolean isFull() {
	 if(rear==arr.length-1) {
		 return true;
	 }
	 else
		 return false;
	 
	}
	
	
	public void enqueue(int element) {
		
		if(isFull()) {
			System.out.println("Queue Is Full!...");
			return;
		}
		
		if(rear==-1) {
			front=0;
			
		}
		arr[++rear]=element;
		size++;
	}
	
	
	public int dequeue() {
		
		if(isEmpty()) {
			System.out.println("Queue Is Empty!...");
			return -1;
			
		}
		
		 int x=arr[front];
		 front++;
		 size--;
		 return x;
	
		
	}
	
	void display() {
		
		if(size==0) {
			System.out.println("Queue is empty!..");
			return;
			
		}
		for (int i =front; i <=rear; i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	
	
	

}
