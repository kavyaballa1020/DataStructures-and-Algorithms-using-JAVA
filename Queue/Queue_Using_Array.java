package Queue;

public class Queue_Using_Array {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void enQueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is overflow");
            } else if (rear == -1 && front == -1) {
                rear = front = 0;
                arr[rear] = data;
            } else {
                rear++;
                arr[rear] = data;
            }
        }

        public void deQueue() {
            if (rear == -1) {
                System.out.println("Queue is underflow");
            } else if (rear == front) {
                rear = front = -1;
            } else {
                front++;
            }
        }

        public void peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
            } else {
                System.out.println(arr[front]);
            }
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.display();

        queue.deQueue();
        queue.peek();
        queue.display();

        queue.deQueue();
        queue.deQueue();
        queue.deQueue(); // Attempt to dequeue from an empty queue
    }
}
