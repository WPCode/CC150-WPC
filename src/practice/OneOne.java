package practice;

public class OneOne {
	
	
	//Implement an algorithm to determine if a string has all unique characters. 
	//What if you can not use additional data structures?
	
	private static boolean isUniqueChar1(String word) {
		boolean[] ch = new boolean[256];
		for(int i = 0; i < word.length(); i++) {
			char each = word.charAt(i);
			int num = (int) each;
			if(ch[num]) return false;
			ch[num] = true;
		}
		return true;
	}

	private static boolean isUniqueChar2(String word) {
		
		int check = 0;
		for (int i = 0; i < word.length(); i++) {
			int num = word.charAt(i) - 'a';
			if ((check & (1 << num)) > 0) {
				return false;
			} else {
				check |= 1 << num;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		String[] words = {"abcde", "hello", "apple", "kite", "padle", "a"};
		for(String word : words){
			System.out.println(word + ": " + isUniqueChar1(word) + " " + isUniqueChar2(word));
		}
		
	}
}