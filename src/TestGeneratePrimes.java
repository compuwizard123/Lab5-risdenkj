import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestGeneratePrimes {

	
	private ArrayList<Integer> list(int... ints) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : ints)
			ret.add(i);
		return ret;
	}
}
