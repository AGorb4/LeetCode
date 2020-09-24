
import org.junit.jupiter.api.Test;

class DIStringMatch {

	@Test
	void test() {
		int[] result = diStringMatch("IDID");
		for(int i : result) {
			System.out.println(i);
		}
	}
	
	 public int[] diStringMatch(String S) {
	        int N = S.length();
	        int lo = 0, hi = N;
	        int[] ans = new int[N + 1];
	        for (int i = 0; i < N; ++i) {
	            if (S.charAt(i) == 'I')
	                ans[i] = lo++;
	            else
	                ans[i] = hi--;
	        }

	        ans[N] = lo;
	        return ans;
	    }
}
