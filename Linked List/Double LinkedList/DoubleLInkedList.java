package LinkedList;

import java.util.Scanner;

public class DoubleLInkedList {
	class node{
		int data;
		node next;
		node prev;
		node(int data){
			this.data=data;
		}
	}
	node head;
	int size=0;
	public void addFirst(int data) {
		size++;
		node newnode=new node(data);
		if(head==null) {
			head=newnode;
		}else {
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
	}
	public void addEnd(int data) {
		size++;
		node newnode=new node(data);
		if(head==null) {
			head=newnode;
		}else {
			node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
		}
	}
	public void addPos(int data) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter position: ");
	    int pos = sc.nextInt();

	    if (pos < 1 || pos > size + 1) {
	        System.out.println("Invalid");
	        return;
	    }

	    node newnode = new node(data);

	    if (pos == 1) {
	        newnode.next = head;
	        if (head != null)
	            head.prev = newnode;
	        head = newnode;
	    } else {
	        int i = 1;
	        node temp = head;
	        while (i < pos - 1) {
	            temp = temp.next;
	            i++;
	        }
	        newnode.next = temp.next;
	        newnode.prev = temp;
	        if (temp.next != null)
	            temp.next.prev = newnode;
	        temp.next = newnode;
	    }

	    size++;
	}

	public void display() {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" <-> ");
				temp=temp.next;
			}
			System.out.println("null");
			System.out.println();
		}
	}
	public void removeFirst() {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			head=head.next;
			head.prev=null;
		}
		size--;
	}
	public void removeLast() {
	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    if (head.next == null) {
	        head = null;  
	    } else {
	        node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.prev.next = null;  
	    }

	    size--;
	}

	public void removePos() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter position to remove: ");
	    int pos = sc.nextInt();

	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    if (pos < 1 || pos > size) {
	        System.out.println("Invalid position");
	        return;
	    }

	    if (pos == 1) {
	        head = head.next;
	        if (head != null)
	            head.prev = null;
	    } else {
	        int i = 1;
	        node temp = head;
	        while (i < pos - 1) {
	            temp = temp.next;
	            i++;
	        }
	        node temp1 = temp.next;
	        temp.next = temp1.next;
	        if (temp1.next != null)
	            temp1.next.prev = temp;
	    }

	    size--;
	}
	public void reverse() {
		node prevnode=null;
		node current=head;
		node nextnode=null;
		if (current != null)  
			nextnode = current.next;
		
		while(current!=null) {
			current.next=prevnode;
			current.prev=nextnode;
			prevnode=current;
			current=nextnode;
			if(nextnode != null) {
				nextnode=nextnode.next;
			}
		}
		head=prevnode;
	}

	public static void main(String[] args) {
		DoubleLInkedList d=new DoubleLInkedList();
		d.addFirst(10);
		d.addFirst(20);
		d.display();
		d.addEnd(30);
		d.display();
		d.addPos(40);
		d.display();
		d.removeFirst();
		d.display();
		d.removePos();
		d.display();
		d.removeLast();
		d.display();
		d.addFirst(100);
		d.addFirst(200);
		d.reverse();
		d.display();
	}

}
