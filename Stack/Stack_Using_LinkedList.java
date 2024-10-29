package Stack;

import java.util.Scanner;

public class Stack_Using_LinkedList {
	class node{
		int data;
		node next;
		node(int data){
			this.data=data;
			next=null;
		}
	}
	node top;
	public void push(int x) {
		node newnode=new node(x);
		if(top==null) {
			top=newnode;
		}else {
			newnode.next=top;
			top=newnode;
		}
	}
	public void pop() {
		if(top==null) {
			System.out.println("Underflow condition of Stack");
		}else {
			top=top.next;
		}
	}
	public void peek() {
		if(top==null) {
			System.out.println("Underflow condition of Stack");
		}else {
			System.out.println(top.data);
		}
	}
	public void display() {
		node temp=top;
		if(top==null) {
			System.out.println("Underflow condition of Stack");
		}else {
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args) {
		Stack_Using_LinkedList s= new Stack_Using_LinkedList();
		Scanner obj = new Scanner(System.in);
		int k = 1;
		while (k == 1) {
			System.out.println(
					"1. push\n 2. pop\n 3. peek\n 4. display\n");
			int ch = obj.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Data");
				int x = obj.nextInt();
				s.push(x);
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.peek();;
				break;
			case 4:
				s.display();;
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
