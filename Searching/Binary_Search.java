package Searching;

public class Binary_Search {

	public static void main(String[] args) {
		int a[] = { 32, 45, 75, 87, 89, 90, 95, 98 };
		int left, right, mid;
		left = 0;
		right = a.length - 1;
		boolean status = false;
		int key = 89;
		while (left <= right) {
			mid = (left + right) / 2;
			if (key == a[mid]) {
				status=true;
				break;
			} else if (key < a[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		if(status==true) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
	}
}
