package Ds_08_Stack;

public class Stack {

	int[] arr;
	int top;

	/**
	 * @param arr
	 * @param top
	 */
	public Stack(int size) {

		arr = new int[size];
		top = -1;
	}

	boolean isFull() {
		if (top == arr.length - 1)
			return true;
		else
			return false;

	}

	boolean isEmpty() {
		if (top == -1) {
			return true;
		} else
			return false;
	}
	
	void push(int ele){
		
		if(!isFull()) {
		arr[++top]=ele;
		}
		else
			System.out.println("Stack OverFlow");
		
	}
	
	int pop(){
		if(!isEmpty()) {
			int ele=arr[top];
			top--;
			return ele;
		}
		else
			System.out.println("Stack Underfow");
			return -1;
		
	}
	
	int peek() {
		if(!isEmpty())
			return arr[top];
		else
			System.out.println("Stack UnderFlow");
		return -1;
	}

}