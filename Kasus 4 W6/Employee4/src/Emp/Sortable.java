package Emp;

public abstract class Sortable {
	 public abstract int compare(Sortable b);
	 
	 //Source : https://www.geeksforgeeks.org/shellsort/
	 public static void shell_sort(Sortable[] a){
		 int n = a.length;
		 for (int gap = n/2; gap > 0; gap /= 2){
			 for (int i = gap; i < n; i += 1){
				 Sortable temp = a[i];
				 int j;

				 for (j = i; j >= gap && a[j - gap].compare(temp) == 1; j -= gap)
					a[j] = a[j - gap];
				 	a[j] = temp;
			 }
		 }
	 }
}

