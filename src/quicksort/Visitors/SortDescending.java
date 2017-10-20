package quicksort.Visitors;

public class SortDescending implements ISortOrder{

	@Override
	public void sort(int[] A) {
		for(int i = 0; i < A.length / 2; i++)
		{
		    int temp = A[i];
		    A[i] = A[A.length - i - 1];
		    A[A.length - i - 1] = temp;
		}
	}

}
