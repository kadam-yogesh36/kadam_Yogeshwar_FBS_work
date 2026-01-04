package Ds_Linkedist;

public class LinkedList {
	Node start;

	/**
	 * @param start
	 */
	public LinkedList() {
		
		this.start = null;
	}
	
	public boolean isEmpty() {
		if(start==null) {
			return true;
			
		}
		else
			return false;
	}
	
public void insertAtEnd(int element){
	if(isEmpty())
	start=new Node(element);
	else
	{
		Node temp=start; 
		
		
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		Node connector= new Node(element);
		temp.setNext(connector);
		
		
	}
	 
}

public void insertAtBegining(int element) {
	if(isEmpty())
		start=new Node(element);
		else {
			Node  temp=new Node(element);
			   temp.setNext(start);
			   start=temp;
		}
	
}

public int size() {
	Node temp=start;
	int count=0;
	while(temp !=null) {
		count++;
		temp=temp.getNext();
		
	}
	return count;
	
}
public void insertAt(int pos,int element) {
	
	       Node newNode=new Node(element);
	       
	       if(pos< 0 || pos > size()) {
	    	   System.out.println("Invlid Position!...");
	    	   return;
	       }
	       
	       if(pos==0) {
	    	   newNode.setNext(start);
	    	   start=newNode;
	    	   return;
	       }
	       
	       
	       Node temp=start;
	       
	       for (int i = 1; i < pos-1; i++) {
	    	   temp=temp.getNext();
			
		}
	       
	       newNode.setNext(temp.getNext());
	       temp.setNext(newNode);
	
}

void deletePosition(int pos) {
	if(isEmpty()) {
		System.out.println("LinkedList is Already Empty");
		return;
		
	}
	else if(pos==1) {
		start=start.getNext();
		
	}else if(pos < 0 || pos >size()) {
		System.out.println("Wrong Position!....");
		return;
	}
	else
	{
		int count=1;
		Node temp=start;
		
		while(temp.getNext()!=null && count < pos-1) {
			temp=temp.getNext();
			count++;
		}
		
		temp.setNext(temp.getNext().getNext());
	}
	
}
void display() {
	if(!isEmpty()) {
		Node temp=start;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
	System.out.println();
}

public void deleteFromFront() {
	  if(isEmpty()) {
		  System.out.println("List Is Empty");
		  return;
	  }
	  else
	  {
	       start=start.getNext();
	  }
	
}

public void deleteFromEnd() {
	Node temp=start;
	 if(isEmpty()) {
		  System.out.println("List Is Empty");
		 
	  }
	 else if(temp.getNext()==null){
		 start=null;
		 
	 }
	 {
		 
		 
		 while(temp.getNext().getNext()!=null) {
			 temp=temp.getNext();
			 
		 }
		 temp.setNext(null);
		 
	 }
	
}



	
	
	
	

}
