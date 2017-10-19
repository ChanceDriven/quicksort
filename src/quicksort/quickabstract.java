package quicksort;

public abstract class quickabstract {
	public void sort(int[] A, int low, int high) {
		if (low < high) {
			int p = partition(A, low, high);
			sort(A, low, p);
			sort(A, p + 1, high);
		}
	}
	
	public abstract int pickPivot(int low, int high);
	
	public int partition(int[] A, int low, int high) {
		int pivot = pickPivot(low, high);
		int pivotVal = A[pivot];
		
		int i = low - 1;
		for (int j = low; j < high -1; j++) {
			if (A[j] < pivotVal) {
				i++;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		
		if (A[high] < A[i+1]) {
			int temp = A[i+1];
			A[i+1] = A[high];
			A[high] = temp;
		}
		
		return i + 1;
	}
}
