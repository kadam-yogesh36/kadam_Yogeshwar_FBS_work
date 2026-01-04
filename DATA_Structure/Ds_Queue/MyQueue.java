package Ds_Queue;

class MyQueue {
    int arr[];
    int front, rear, size;

    // Constructor
    MyQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // isEmpty
    boolean isEmpty() {
        return rear == -1;
    }

    // isFull
    boolean isFull() {
        return rear == size - 1;
    }

    // Enqueue
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

       int i=rear;
       
       while(i>=0 && arr[i]<data) {
    	   arr[i+1]=arr[i];
    	   i--;
    	   
       }
       arr[i+1]=data;
       rear++;
       
       
       
    }

    // Dequeue
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(arr[0] + " removed");

        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
    }


    // Display
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
