
public class NumbersEvenDigits {

	public static void main(String[] args) {
		System.out.println(findNumbers(new int [] {1, 22, 123, 1234}));
	}
	
    public static int findNumbers(int[] nums) {
        
    	if(nums == null) return 0;
    	
    	int evenDigitNumbers = 0;
    	for(int integer : nums) {
    		if(Integer.valueOf(integer).toString().length() % 2 == 0) {
    			evenDigitNumbers++;
    		}
    	}
    	
    	return evenDigitNumbers;
    }
}
