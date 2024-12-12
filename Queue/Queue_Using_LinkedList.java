package Queue;

import java.util.Scanner;

public class Queue_Using_LinkedList {
	class node{
		int data;
		node next;
		node(int data){
			this.data=data;
			this.next=null;
		}
	}
	node rear=null;
	node front=null;
	public void enqueue(int data) {
		node newnode=new node(data);
		if(rear==null && front==null) {
			rear=front=newnode;
		}else {
			rear.next=newnode;
			rear=newnode;
		}
	}
	public void dequeue() {
		if(rear==null && front==null) {
			System.out.println("Queue is Uderflow");
		}else if(rear==front) {
			rear=front=null;
		}
		else {
			front=front.next;
		}
	}
	public void peek() {
		if(rear==null && front==null) {
			System.out.println("Queue is Uderflow");
		}else {
			System.out.println("Peek element is : "+front.data);
		}
	}
	public void display() {
		if(rear==null && front==null) {
			System.out.println("Queue is Uderflow");
		}else {
			node temp=front;
			while(temp!=null) {
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Queue_Using_LinkedList q=new Queue_Using_LinkedList();
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
				q.enqueue(x);
				break;
			case 2:
				q.dequeue();
				break;
			case 3:
				q.peek();
				break;
			case 4:
				q.display();
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
