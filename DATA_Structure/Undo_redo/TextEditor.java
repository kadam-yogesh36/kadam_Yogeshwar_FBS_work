package Ds_Stack_ps;

public class TextEditor<T> {

	T[] arr;
	int top;

	public TextEditor(int size) {

		arr = (T[]) new Object[size];
		top = -1;

	}

	boolean isEmpty() {
		if (top == -1) {
			return true;
		} else
			return false;
	}

	boolean isFull() {
		if (top == arr.length - 1)
			return true;
		else
			return false;
	}

	void write(T element) {
		if (!isFull()) {
			arr[++top] = element;
		} else
			System.out.println("Stack OverflowError.....");

	}

	T undo() {
		if (!isEmpty()) {
			T element = arr[top--];
			return element;
		} else
			System.out.println("Stack UnderFlow......");
		return null;

	}
	
	void display() {
		TextEditor<T> te=new TextEditor<T>(top+1);
		 while (!this.isEmpty()) {
		        te.write(this.undo());
		    }
		
		 while (!te.isEmpty()) {
		        T element = te.undo();
		        System.out.print(element + " ");
		        this.write(element);
		    }
	}
	
	
	
}
