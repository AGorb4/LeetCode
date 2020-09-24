
public class JewelsAndStones {
	
	
//	You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  
//Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//	The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
//so "a" is considered a different type of stone from "A".

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int numJewelsInStones(String J, String S) {

		int jewelCounter = 0;
		for (char c : S.toCharArray()) {
			if (J.contains(c + "")) {
				jewelCounter++;
			}
		}
		return jewelCounter;
	}
}
