package Stack;
import java.util.*;

public class Stack_Using_ArrayList {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
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
				int peek=s.get(s.size()-1);
				System.out.println(peek);
				break;
			case 4:
				System.out.println(s);
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
