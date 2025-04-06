package LinkedList;

import java.util.Scanner;

public class CircularLinkedList {
	class node{
		int data;
		node next;
		node(int data){
			this.data=data;
		}
	}
	node tail;
	int size=0;
	public void addFirst(int data){
		node newnode=new node(data);
		if(tail==null) {
			tail=newnode;
			tail.next=tail;
		}else {
			newnode.next=tail.next;
			tail.next=newnode;
		}
		size++;
	}
	public void addEnd(int data) {
		node newnode=new node(data);
		if(tail==null) {
			tail=newnode;
			tail.next=tail;
		}else {
			newnode.next=tail.next;
			tail.next=newnode;
			tail=newnode;
		}
		size++;
	}
	public void addPos(int data) {
		node newnode=new node(data);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Position");
		int pos=sc.nextInt();
		int i=1;
		if(pos<1 || pos>size) {
			System.out.println("Invalid");
		}
		if(pos==1) {
			if(tail==null) {
				tail=newnode;
				tail.next=tail;
			}else {
				newnode.next=tail.next;
				tail.next=newnode;
			}
		}
		else {
			node temp=tail.next;
			while(i<pos-1) {
				temp=temp.next;
				i++;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}
	}
	public void removeFirst() {
		if(tail==null) {
			System.out.println("list is empty");
		}
		node temp=tail.next;
		tail.next=temp.next;
	}
	public void removeLast() {
		if(tail==null) {
			System.out.println("list is empty");
		}
		node temp=tail.next;
		while(temp.next!=tail) {
			temp=temp.next;
		}
		temp.next=tail.next;
		tail=temp;
	}
	public void removePos() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Position");
		int pos=sc.nextInt();
		int i=1;
		if(pos<1 || pos>size) {
			System.out.println("Invalid");
		}
		if(pos==1) {
			if(tail==null) {
				System.out.println("list is empty");
			}
			node temp=tail.next;
			tail.next=temp.next;
		}
		else {
			node temp=tail.next;
			while(i<pos-1) {
				temp=temp.next;
				i++;
			}
			node temp1=temp.next;
			temp.next=temp1.next;
		}
	}
	public void display() {
		node temp=tail.next;
		while(temp!=tail) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println(tail.data+" ");
	}
	public void reverse() {
		if(tail==null) {
			System.out.println("List is empty");
		}else {
			node prev=null;
			node current=tail.next;
			node nextnode=null;
			node head=tail.next;
			do {
				nextnode=current.next;
				current.next=prev;
				prev=current;
				current=nextnode;
			}while(current!=head);
			head.next=prev;
			tail=head;
		}
	}

	public static void main(String[] args) {
		CircularLinkedList c=new CircularLinkedList();
		c.addFirst(10);
		c.addFirst(20);
		c.addFirst(30);
		c.display();
		c.addEnd(40);
		c.display();
		c.addPos(200);
		c.display();
		c.removeFirst();
		c.display();
		c.removeLast();
		c.display();
		c.removePos();
		c.display();
		c.reverse();
		c.display();

	}

}
