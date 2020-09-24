import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {4,0,2,-5,-4};
		System.out.println(uniqueOccurrences(arr));

	}
	
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mapOfOccurances = new HashMap<>();
        Set<Integer> uniqueSet = new HashSet<>();
        for(int i : arr) {
        	if(mapOfOccurances.get(i) == null) {
        		mapOfOccurances.put(new Integer(i), new Integer(1));
        	} else {
        		mapOfOccurances.put(new Integer(i), mapOfOccurances.get(new Integer(i)) + 1);
        	}
        }
        
        for(Integer key : mapOfOccurances.keySet()) {
        	if(!uniqueSet.add(mapOfOccurances.get(key))) return false;
        }
        
    	return true;
    }

}
