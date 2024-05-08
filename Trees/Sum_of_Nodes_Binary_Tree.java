package Trees;
import java.util.*;

public class Sum_of_Nodes_Binary_Tree {
	class node{
		int data;
		node right,left;
		node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public node create(Scanner scanner) {
        System.out.println("Enter data (-1 for no node):");
		int data=scanner.nextInt();
		if(data==-1) {
			return null;
		}else {
			node newnode=new node(data);
	        System.out.println("Enter left child of " + data);
			newnode.left=create(scanner);
	        System.out.println("Enter right child of " + data);
			newnode.right=create(scanner);
			return newnode;
		}
	}
	public void preorder(node root) {
		if(root==null){
			return;
		}else {
			System.out.print(root.data+"-->");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public int sum_of_nodes(node root) {
		if(root==null) {
			return 0;
		}else {
			int leftsum=sum_of_nodes(root.left);
			int rightsum=sum_of_nodes(root.right);
			return leftsum+rightsum+root.data;
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Sum_of_Nodes_Binary_Tree t=new Sum_of_Nodes_Binary_Tree();
		node root;
		root=null;
		root=t.create(scanner);
		t.preorder(root);
		System.out.println("Sum of nodes "+t.sum_of_nodes(root));
	}

}
