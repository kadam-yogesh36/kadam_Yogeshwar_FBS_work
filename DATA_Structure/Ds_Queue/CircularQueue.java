package Ds_Queue;

import java.util.Iterator;

public class CircularQueue {
	    int front,rear,size;
	    int [] arr;
		/**
		 * 
		 */
		public CircularQueue(int size) {
			arr=new int[size];
			 front=-1;
			 rear=-1;
			 size=0;
		}
		
		public void enqueue(int element) {
			
			if(size==0) {
				front=0;
				rear=0;
				arr[0]=element;
				size++;
				
			}
			
			else if(size==arr.length) {
				System.out.println("Queue is Full...");
				return;
				
			}
			
			else if(rear< arr.length-1) {
				arr[++rear]=element;
				size++;
				
				
			}
			
			else if(rear==arr.length-1) {
				rear=0;
				arr[0]=element;
				size++;
			}
		}
		
		public int dequeue() throws Exception {
			
			if(size==0) {
				throw new Exception("Queue Is Empty!.....");
				
			}
			
			if(front==arr.length-1) {
				int x=arr[front];
				front=0;
				size--;
				return x;
			}
			else
			{
				int x=arr[front];
				front++;
				size--;
				return x;
			}
		}
		
		public void display() {
			if(size==0) {
				System.out.println("Queue is Empty!....");
				return;
			}
			
			if(front<rear) {
				for (int i = front; i <=rear; i++) {
					System.out.print(arr[i]+" ");
					
				}
				
			}
			else if(rear<front) {
				for (int i = front; i <arr.length; i++) {
					System.out.print(arr[i]+" ");
					
				}
				for (int i =0; i <=rear; i++) {
					System.out.print(arr[i]+" ");
					
				}
				
			}
			System.out.println();
		}
	    
	    

}
