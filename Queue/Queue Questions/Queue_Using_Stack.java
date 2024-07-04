package Queue;
import java.util.*;
public class Queue_Using_Stack {
	Stack<Integer> s1=new Stack<Integer>();
	Stack<Integer> s2=new Stack<Integer>();
	
	public void enqueue(int data) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(data);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	public void dequeue() {
		if(s1.isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			s1.pop();
		}
	}
	public void peek() {
		if(s1.isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			System.out.println(s1.peek());
		}
	}

	public static void main(String[] args) {
		Queue_Using_Stack q=new Queue_Using_Stack();
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
				System.out.println(q.s1);
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
