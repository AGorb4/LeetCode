
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class HappyNumber {

	@Test
	void test() {
		System.out.print(isHappy(49));
	}

	private boolean isHappy(int n) {
		Set<Integer> uniqueNumbers = new HashSet<>();

		while (uniqueNumbers.add(n)) {
			int squaredSum = 0;
			while (n > 0) {
				int lastDigit = n % 10;
				squaredSum += (lastDigit) * (lastDigit);
				n = n / 10;
			}
			n = squaredSum;
		}

		return n == 1;
	}
}
