package Sorting;

public class Selection_sort {

	public static void main(String[] args) {
		int a[]= {7,4,10,8,3,1};
		int n=a.length;
		int temp;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			if(min!=i) {
				temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
