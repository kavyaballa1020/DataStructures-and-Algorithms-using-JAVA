package Queue;
import java.util.*;

public class Queue_Using_CollectionFramework {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<Integer>();
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
				q.add(x);
				break;
			case 2:
				q.remove();
				break;
			case 3:
				q.peek();
				break;
			case 4:
				System.out.println(q);
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
