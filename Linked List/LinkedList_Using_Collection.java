package LinkedList;

import java.util.*;

public class LinkedList_Using_Collection {

	public static void main(String[] args) {

		LinkedList<Integer> ls = new LinkedList<Integer>();

		Scanner obj = new Scanner(System.in);
		int k = 1;
		while (k == 1) {
			System.out.println("1. addFirst\n 2. addLast\n 3. deleteFirst\n 4. deleteLast\n 5. display\n 6. size");
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
				ls.removeFirst();
				break;
			case 4:
				ls.removeLast();
				break;
			case 5:
				System.out.println(ls);
				break;
			case 6:
				int z = ls.size();
				System.out.println(z);
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
