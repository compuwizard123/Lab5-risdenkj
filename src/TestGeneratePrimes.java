import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestGeneratePrimes {

	@Test
	public void testZero() {
		assertEquals(new ArrayList<Integer>(), PrimeNumbers
				.actuallyGeneratePrimes(0));
	}

	@Test
	public void testOne() {
		assertEquals(list(), PrimeNumbers.actuallyGeneratePrimes(1));
	}

	@Test
	public void testTwo() {
		assertEquals(list(), PrimeNumbers.actuallyGeneratePrimes(2));
	}

	@Test
	public void testThree() {
		assertEquals(list(2), PrimeNumbers.actuallyGeneratePrimes(3));
	}

	@Test
	public void testFour() {
		assertEquals(list(2, 3), PrimeNumbers.actuallyGeneratePrimes(4));
	}

	@Test
	public void testSix() {
		assertEquals(list(2, 3, 5), PrimeNumbers.actuallyGeneratePrimes(6));
	}
	
	@Test
	public void testThirteen() {
		assertEquals(list(2,3,5,7,11), PrimeNumbers.actuallyGeneratePrimes(13));
	}

	private ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : ints)
			ret.add(i);
		return ret;
	}
}
