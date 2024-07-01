package Queue;

import java.util.Scanner;

public class Circular_Queue_Using_Array {
	class circularQueue{
		static int size;
		static int arr[];
		static int rear=-1;
		static int front=-1;
		circularQueue(int size){
			arr=new int[size];
			this.size=size;			
		}
		public void enqueue(int data) {
			if((rear+1)%size==front) {
				System.out.println("Circular Queue is Overflow");
			}else if(rear==-1 && front==-1) {
				rear=front=0;
				arr[rear]=data;
			}else {
				rear=(rear+1)%size;
				arr[rear]=data;
			}
		}
		public void deQueue() {
			if(front==-1 && rear==-1) {
				System.out.println("Circular Queue is Underflow");	
			}else if(front==rear) {
				front=rear=-1;
			}else {
				front=(front+1)%size;
			}
		}
		public void display() {
			if(front==-1 && rear==-1) {
				System.out.println("Circular Queue is Underflow");	
			}else {
				int i=front;
				while(i!=rear) {
					System.out.println(arr[i]);
					i=(i+1)%size;
				}
				System.out.println(arr[rear]);
			}
		}
		public void peek() {
			if(front==-1 && rear==-1) {
				System.out.println("Circular Queue is Underflow");	
			}else {
				System.out.println("The peek eleement is "+arr[front]);
			}
		}
	}

	public static void main(String[] args) {
		Circular_Queue_Using_Array C=new Circular_Queue_Using_Array();
		circularQueue c=C.new circularQueue(6);
		Scanner obj = new Scanner(System.in);
		int k = 1;
		while (k == 1) {
			System.out.println(
					"1. Enqueue\n 2. deQueue\n 3. peek\n 4. display\n");
			int ch = obj.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Data");
				int x = obj.nextInt();
				c.enqueue(x);
				break;
			case 2:
				c.deQueue();
				break;
			case 3:
				c.peek();
				break;
			case 4:
				c.display();
				break;
			default:
				System.out.println("Invalid\n");
				break;
			}
			System.out.println("Press 1 for continue and 0 for exit\n");
			k = obj.nextInt();

		}

	}

}
