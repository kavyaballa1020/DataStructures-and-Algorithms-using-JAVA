package Searching;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = { 21, 32, 4, 64, 32, 56 };
		int key = 65;
		boolean status=true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				status=true;
			} else {
				status=false;
			}
		}
		if(status==true) {
			System.out.println("Element Found");
		}else {
			System.out.println("Element not Found");
		}
	}
}
