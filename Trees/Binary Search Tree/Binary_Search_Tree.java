package Trees;
import java.util.*;

public class Binary_Search_Tree {
	class node{
		int data;
		node left,right;
		node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public node insertion(node root,int data) {
		if(root==null) {
			return new node(data);
		}
			if(data<root.data) {
				root.left=insertion(root.left,data);
			}
			if(data>root.data) {
				root.right=insertion(root.right,data);
			}
			return root;
	}
	public void Inorder(node root) {
		if(root==null) {
			return;
		}
			Inorder(root.left);
			System.out.print(root.data+" ");
			Inorder(root.right);
	}

	public static void main(String[] args) {
		Binary_Search_Tree t=new Binary_Search_Tree();
		node root;
		root=null;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Data (negative numbers to break)");
		while(true) {
			int data=obj.nextInt();
			if(data<0) {
				break;
			}
			root=t.insertion(root, data);
		}
		System.out.println("Inorder");
		t.Inorder(root);
	}
}
