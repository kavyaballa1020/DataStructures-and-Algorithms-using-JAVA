package Trees;

import java.util.Scanner;

public class Print_Inclusive_Range_in_BST {
	class node {
		int data;
		node left, right;

		node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public node insertion(node root, int data) {
		if (root == null) {
			return new node(data);
		}
		if (data < root.data) {
			root.left = insertion(root.left, data);
		}
		if (data > root.data) {
			root.right = insertion(root.right, data);
		}
		return root;
	}
	
	public void printInRange(node root,int x,int y) {
		if(root==null) {
			return;
		}
		if(root.data>=x && root.data<=y) {
			printInRange(root.left,x,y);
			System.out.print(root.data+" ");
			printInRange(root.right,x,y);
		}else if(root.data<x) {
			printInRange(root.right,x,y);
		}else {
			printInRange(root.left,x,y);
		}
	}

	public void Inorder(node root) {
		if (root == null) {
			return;
		}
		Inorder(root.left);
		System.out.print(root.data + " ");
		Inorder(root.right);
	}

	public static void main(String args[]) {
		Print_Inclusive_Range_in_BST t = new Print_Inclusive_Range_in_BST();
		node root;
		root = null;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Data (negative numbers to break)");
		while (true) {
			int data = obj.nextInt();
			if (data < 0) {
				break;
			}
			root = t.insertion(root, data);
		}
		System.out.println("Enter range");
		int x=obj.nextInt();
		int y=obj.nextInt();
		System.out.println("Inorder");
		t.Inorder(root);
		System.out.println();
        System.out.println("\nValues in range [" + x + ", " + y + "]:");
		t.printInRange(root, x, y);
		obj.close();
	}
}
