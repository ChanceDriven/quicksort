package quicksort;

public class quickconcrete1 extends quickabstract{	
	
	public int pickPivot(int[] A, int low, int high) {
		//random
		return A[low + (high-low)/2];
	}
}
