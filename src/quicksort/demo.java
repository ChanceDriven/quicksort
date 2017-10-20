package quicksort;

import java.util.Arrays;

import quicksort.Visitors.SortAscending;
import quicksort.Visitors.SortDescending;

public class demo {
	public static void main ( String [] arguments ) {
		int[] A = new int[5];
		A[0] = 5;
		A[1] = 2;
		A[2] = 30;
		A[3] = 4;
		A[4] = 10;
		
		System.out.println("Unsorted " + Arrays.toString(A));
		quickconcrete1 sorter = new quickconcrete1();
		sorter.sort(A, new SortDescending());
		System.out.println("Sort with pivot1 " + Arrays.toString(A));
		
		A[0] = 5;
		A[1] = 2;
		A[2] = 30;
		A[3] = 4;
		A[4] = 10;
		
		System.out.println("Unsorted " + Arrays.toString(A));
		quickconcrete2 sorter2 = new quickconcrete2();
		sorter2.sort(A, new SortAscending());
		System.out.println("Sort with pivot2 " + Arrays.toString(A));
	}
}
