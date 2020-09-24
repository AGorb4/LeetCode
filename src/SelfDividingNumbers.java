import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		selfDividingNumbers(1, 22);

	}
	
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbersList = new ArrayList<>();
        for(int i = left; i <= right; i++) {
        	String s = Integer.valueOf(i).toString();
        	if(s.length() > 1 && !s.contains("0")) {
        		boolean isSelfDivisible = false;
        		for(char c : s.toCharArray()) {
        			System.out.println("Integer value of " + c + " : " + new Integer(String.valueOf(c)));
        			if(i % new Integer(String.valueOf(c)) == 0) isSelfDivisible = true;
        			else isSelfDivisible = false;
        			break;
        		}
        		
        		if(isSelfDivisible) selfDividingNumbersList.add(new Integer(i));
        	} else if (s.length() == 1) {
        		selfDividingNumbersList.add(new Integer(i));
        	}
        }
        
    	
    	return selfDividingNumbersList;
    }
    
    public static List<Integer> selfDividingNumbers2(int left, int right){
    	List<Integer> selfDividingNumbers = new ArrayList<>();
    	while(left <= right) {
    		checkIfSelfDividing(left, selfDividingNumbers);
    		left++;
    	}
    	
    	return selfDividingNumbers;
    }
    
    public static void checkIfSelfDividing(int integer, List<Integer> selfDividingNumbers) {
    	if(integer < 10) {
    		selfDividingNumbers.add(new Integer(integer));
    		return;
    	}
    	
    	String integerString = Integer.valueOf(integer).toString();
    	if(!integerString.contains("0")) {
    		boolean isSelfDivisible = false;
    		for(char c : integerString.toCharArray()) {
    			if(integer % Integer.parseInt(String.valueOf(c)) == 0) {
    				isSelfDivisible = true;
    			} else {
    				isSelfDivisible = false;
    			}
    		}
    		if(isSelfDivisible) selfDividingNumbers.add(integer);
    	}
    	
    }
    
    
}
