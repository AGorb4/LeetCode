import java.util.ArrayList;
import java.util.Stack;

public class BalancedStrings {
	
	
//	Balanced strings are those who have equal quantity of 'L' and 'R' characters.
//
//	Given a balanced string s split it in the maximum amount of balanced strings.
//
//	Return the maximum amount of splitted balanced strings.
//
//	 
//
//	Example 1:
//
//	Input: s = "RLRRLLRLRL"
//	Output: 4
//	Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
//	Example 2:
//
//	Input: s = "RLLLLRRRLR"
//	Output: 3
//	Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
//	Example 3:
//
//	Input: s = "LLLLRRRR"
//	Output: 1
//	Explanation: s can be split into "LLLLRRRR".
//	Example 4:
//
//	Input: s = "RLRRRLLRLL"
//	Output: 2
//	Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'

	public static void main(String[] args) {
		System.out.println(balancedStringSplit(new String("RLRRLLRLRL")));

	}
	
    public static int balancedStringSplit(String s) {
    	int balancedStringCounter = 0;
    	
    	Stack<Character> stack = new Stack<Character>();
    	
    	
    	for(int i = 0; i <= s.length() - 1; i++) {
    		if(stack.isEmpty()) {
    			stack.push(new Character(s.charAt(i)));
    		} else {
    			Character stackChar = stack.peek();
    			if(!stackChar.equals(new Character(s.charAt(i)))) {
    				stack.pop();
    				if(stack.isEmpty()) {
    					balancedStringCounter++;
    				}
    			} else{
    				stack.push(new Character(s.charAt(i)));
    			}
    		}
    	}
    	
    	return balancedStringCounter;
    }

}
