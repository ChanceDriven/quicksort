package quicksort;

import quicksort.Visitors.ISortOrder;

public abstract class quickabstract {
	
	private ISortOrder sortOrder;
	
	public void sort(int[] A, ISortOrder sortOrder) {
		quicksort(A, 0, A.length - 1, true);
		this.sortOrder = sortOrder;
		
		sortOrder.sort(A);
	}
	
	public void sort(int[] A, boolean sortAscending) {
		quicksort(A, 0, A.length - 1, sortAscending);
	}
	
	private void quicksort(int[] A, int low, int high, boolean sortAscending) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivot = pickPivot(A, low, high);

		while (i <= j) {
			
			while(A[i] < pivot) {
				i++;
			}

			while (A[j] > pivot) {
				j--;    
			}
			if (i <= j) {
				swap(A, i, j);
				i++;
				j--;
			}

		}
		// Recursion
		if (low < j) {
			quicksort(A, low, j, sortAscending);
		}
		if (i < high) {
			quicksort(A, i, high, sortAscending);
		}
	}

	protected abstract int pickPivot(int[] A, int low, int high);
	
	private void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
