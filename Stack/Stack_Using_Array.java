package Stack;
class stack{
	int s[]=new int[5];
	int top=-1;
	public void push(int x) {
		if(top==s.length-1) {
			System.out.println("Overflow");
		}else {
			top++;
			s[top]=x;
		}
	}
	public void peek() {
		if(top==-1) {
			System.out.println("Underflow");
		}else {
			System.out.println("Top Element is "+s[top]);
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("Underflow");
		}else {
			System.out.println("Deleted Element is "+s[top]);
			top--;
		}
	}
	public void display() {
		if(top==-1) {
			System.out.println("Underflow");
		}else {
			for(int i=0;i<top;i++) {
				System.out.print(s[i]+" ");
			}
			System.out.println();
		}
	}
	public boolean isEmpty() {
		return top==-1;
	}
}
public class Stack_Using_Array{
	public static void main(String[] args) {
		stack s=new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		s.pop();
		s.display();
		s.peek();
	}
}
