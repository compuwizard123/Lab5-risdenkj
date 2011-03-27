import java.util.ArrayList;


public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int n) {
		
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int candidate = 2; n > 1; candidate++) {
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

}
