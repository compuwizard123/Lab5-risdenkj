import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestGeneratePrimes {

	@Test
	public void testZero() {
		assertEquals(new ArrayList<Integer>(), PrimeNumbers.actuallyGeneratePrimes(0));
	}
	
	@Test
	public void testOne() {
		assertEquals(list(), PrimeNumbers.actuallyGeneratePrimes(1));
	}
	
	private ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : ints)
			ret.add(i);
		return ret;
	}
}
