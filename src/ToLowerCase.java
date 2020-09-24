
public class ToLowerCase {

	public static void main(String[] args) {

		System.out.println(toLowerCase("Hello"));
	}
	
	public static String toLowerCase(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i =0;i <= str.length() - 1; i++){
			char c = str.charAt(i);
			if(c > 96 && c < 123) {
				sb.append(c);
			} else if (c > 64 && c < 91) {
				sb.append(Character.toLowerCase(c));
			}
		}
		return sb.toString();
	}

}
