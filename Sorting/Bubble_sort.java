package Sorting;

public class Bubble_sort {

	public static void main(String[] args) {
		int a[] = { 23, 45, 76, 89, 78, 65, 70 };
		int n = a.length;
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
