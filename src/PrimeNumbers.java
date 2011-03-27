import java.util.ArrayList;

public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int n) {

		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int candidate = 2; n > 1; candidate++) {
			while ((n % candidate) == 0) {
				ret.add(candidate);
				n /= candidate;
			}
		}

		if (n > 1) {
			ret.add(n);
		}
		return ret;
	}

	/**
	 * Unlike the above method, this one actually generates primes instead of
	 * performing a prime factorization. It will produce a list of primes less
	 * than n.
	 * 
	 * @param n
	 *            The ceiling.
	 * @return A list of primes.
	 */
	public static ArrayList<Integer> actuallyGeneratePrimes(int n) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		if (n > 2) {
			ret.add(2);
		}
		for (int i = 3; i < n; i += 2) {
			boolean prime = true;
			for (int j = 3; j < i; j += 2) {
				if ((i % j) == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				ret.add(i);
			}
		}
		return ret;
	}
}
