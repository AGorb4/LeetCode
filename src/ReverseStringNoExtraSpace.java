
public class ReverseStringNoExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//Two Pointers Iteration
	//In this approach, two pointers are used to process two array elements at the same time. 
	//Usual implementation is to set one pointer in the beginning and one at the end and then to move them until they both meet.
    public static void reverseString(char[] s) {
    	//Set pointer left at index 0, and pointer right at index n - 1, where n is a number of elements in the array.
        int left = 0, right = s.length - 1;
    	//While left < right
        while (left < right) {
        	//swap
            char tmp = s[left];
            //index 0 = last index then increment 0
            s[left++] = s[right];
            //last index = index 0 then decrement last index
            s[right--] = tmp;
        }
    }
}
