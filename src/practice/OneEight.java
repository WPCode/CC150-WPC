package practice;

public class OneEight {
	
	/*
		Assume you have a method isSubstring which checks if one word is a substring of
		another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
		only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).

	*/

	public static void main(String[] args){
		int n = 10;

	}

	public boolean checkSubString(String s1, String s2){
		
		if(s1.length()!=s2.length()) return false;
		
		if(s1.length()>0){
			String s1s1 = s1 + s1;
			return isSubString(s2, s1s1);
		}
		
		return false;
		
	}

	private boolean isSubString(String s2, String s1s1) {
		// TODO Auto-generated method stub
		return false;
	}
	
}