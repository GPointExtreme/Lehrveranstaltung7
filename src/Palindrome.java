

public class Palindrome {

	public static void main(String[] args) {
		// noch nicht fertig!
		
		System.out.println(checkPalindrome("Bei Leda, Bodo, bade lieb!"));
		

	}
	
	public static boolean checkPalindrome(String pal) {
		if (pal.length() <= 1) {
			return true;
		}
		char first = Character.toLowerCase(pal.charAt(0));
		char last = Character.toLowerCase(pal.charAt(pal.length()-1));
		if(Character.isLetter(first) && Character.isLetter(last)) {
			if(first==last) {
				return checkPalindrome(pal.substring(1, pal.length()-1));
			}
			return  false;
		}
		if(!Character.isLetter(first)) {
			return checkPalindrome(pal.substring(0));
		}
		if(!Character.isLetter(last)) {
			return checkPalindrome(pal.substring(pal.length()-1));
		}
		return  false;
	}
}
