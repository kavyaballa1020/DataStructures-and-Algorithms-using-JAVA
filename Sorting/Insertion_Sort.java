package Sorting;

public class Insertion_Sort {

	public static void main(String[] args) {
		int a[]= {5,4,10,1,6,0,2};
		int temp;
		int n=a.length;
		for(int i=1;i<n;i++) {
			temp=a[i];
			int j=i-1;
			while(j>=0 && temp<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
