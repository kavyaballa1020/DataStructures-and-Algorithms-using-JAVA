package LinkedList;

import java.util.*;

public class LinkedList_Manual {
	class node {
		int data;
		node next;

		node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	node head;
	int size = 0;

	public void addFirst(int data) {
		size++;
		node newnode = new node(data);
		if (head == null) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void addLast(int data) {
		size++;
		node newnode = new node(data);
		node temp;
		temp = head;
		if (head == null) {
			head = newnode;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}

	public void addPos(int data) {
		size++;
		node newnode = new node(data);
		node temp = head;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Position");
		int pos = sc.nextInt();
		while (i < pos - 1) {
			temp = temp.next;
			i++;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}

	public void display() {
		node temp;
		temp = head;
		if (head == null) {
			System.out.println("List is Empty");
		} else {
			while (temp != null) {
				System.out.print(temp.data + "-->");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public void deleteFirst() {
		size--;
		if (head == null) {
			System.out.println("List is empty");
		} else if (head.next == null) {
			head = null;
		} else {
			head = head.next;
		}
	}

	public void deleteLast() {
		size--;
		node temp;
		temp = head;
		if (head == null) {
			System.out.println("List is empty");
		} else if (head.next == null) {
			head = null;
		} else {
			node temp1 = null;
			while (temp.next != null) {
				temp1 = temp;
				temp = temp.next;
			}
			temp1.next = null;
		}
	}

	public void deletePosition() {
		size--;
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.println("Enter position");
		int pos = sc.nextInt();
		node temp = head;
		node temp1 = temp;
		if (pos > size) {
			System.out.println("Invalid Position");
		}
		while (i < pos) {
			temp1 = temp;
			temp = temp.next;
			i++;
		}
		temp1.next = temp.next;
	}

	public int getSize() {
		return size;
	}

	public void reverseIterate() {
		node prev, current, nextnode;
		prev = null;
		current = head;
		nextnode = current.next;
		while (nextnode != null) {
			current.next = prev;
			prev = current;
			current = nextnode;
			nextnode = nextnode.next;
		}
		current.next = prev;
		head = current;
	}

	public static void main(String[] args) {
		LinkedList_Manual ls = new LinkedList_Manual();
		Scanner obj = new Scanner(System.in);
		int k = 1;
		while (k == 1) {
			System.out.println(
					"1. addFirst\n 2. addLast\n 3. deleteFirst\n 4. deleteLast\n 5. display\n 6. size\n 7. Reverse\n 8. add at specific position \n 9. delete at specific position\n");
			int ch = obj.nextInt();
			switch (ch) {
				case 1:
					System.out.println("Enter Data");
					int x = obj.nextInt();
					ls.addFirst(x);
					break;
				case 2:
					System.out.println("Enter Data");
					int y = obj.nextInt();
					ls.addLast(y);
					break;
				case 3:
					ls.deleteFirst();
					break;
				case 4:
					ls.deleteLast();
					break;
				case 5:
					ls.display();
					break;
				case 6:
					int z = ls.getSize();
					System.out.println(z);
					break;
				case 7:
					ls.reverseIterate();
					break;
				case 8:
					System.out.println("Enter Data");
					int a = obj.nextInt();
					ls.addPos(a);
					break;
				case 9:
					ls.deletePosition();
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
