package quicksort;

import java.util.concurrent.ThreadLocalRandom;

public class quickconcrete2 extends quickabstract {
	public int pickPivot(int low, int high) {
		return ThreadLocalRandom.current().nextInt(low, high + 1);
	}
}
