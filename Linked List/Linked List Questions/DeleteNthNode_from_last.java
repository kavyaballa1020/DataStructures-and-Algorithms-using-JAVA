package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteNthNode_from_last {
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

	public void add(int data) {
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

	public void deleteNthFromLast(int p) {
		int i = 1;
		node temp = head;
		int pos = (size - p) + 1;
		size--;
		if (pos == 1) {
			head = head.next;
		} else if (p > size) {
			System.out.println("Position is greater than the size of the list");
		} else {
			node temp1 = null;
			while (i < pos-1) {
				temp = temp.next;
				i++;
			}
			temp1 = temp;
			temp = temp.next;
			temp1.next = temp.next;
		}

	}

	public static void main(String[] args) {

		DeleteNthNode_from_last ls = new DeleteNthNode_from_last();

		Scanner obj = new Scanner(System.in);
		int k = 1;
		while (k == 1) {
			System.out.println("1. add\n 2. display\n 3. DeleteNthNode_from_last\n");
			int ch = obj.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Data");
				int x = obj.nextInt();
				ls.add(x);
				break;
			case 2:
				ls.display();
				break;
			case 3:
				System.out.println("Enter Position");
				int y = obj.nextInt();
				ls.deleteNthFromLast(y);
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
