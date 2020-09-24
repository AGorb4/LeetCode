
public class PeakIndexInMountain {
	
//		Example 1:
//		Input: [0,1,0]
//		Output: 1
	
//		Example 2:
//		Input: [0,2,1,0]
//		Output: 1

	public static void main(String[] args) {
		System.out.println(returnPeak(new int [] {0,1,2,1,0}));

	}

	public static int returnPeak(int [] mountain) {
		int i = 0;
		while(mountain[i+1] > mountain[i]) i++;
		return i;
	}
}
