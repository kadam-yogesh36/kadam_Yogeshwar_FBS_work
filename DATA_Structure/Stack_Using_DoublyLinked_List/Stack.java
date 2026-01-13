package Stack_Using_DoublyLinked_List;

import DoublyLinked_List.DoublyLinkedList;
import DoublyLinked_List.Node;

public class Stack {
	DoublyLinkedList list;
	int top;

	public Stack() {
		list = new DoublyLinkedList();
		top = -1;

	}

	boolean isEmpty() {
		return top == -1;
	}

	public void push(int ele) {
         Node newNode=new Node(ele);
		if (isEmpty()) {
			
			list.start=list.end=newNode;

		}
		else
		{
			
			newNode.setNext(list.start);
            list.start.setPrev(newNode);   // DLL correction
            list.start = newNode;
		}
		top++;

	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow!..");
			return -1;
		}
		int popped=list.start.getData();
		list.start = list.start.getNext();
		
		
		  if (list.start != null) {
	            list.start.setPrev(null);
	        } else {
	            list.end = null;
	        }

	        top--;
	        return popped;
	    
		
	}
	   // PEEK operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return list.start.getData();
    }


}
