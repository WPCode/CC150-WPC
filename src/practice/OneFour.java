package practice;

public class OneFour {
	
	/*
		Write a method to decide if two strings are anagrams or not.
	*/

	public static void main(String[] args){
		String str1 = "abcde";
		String str2 = "edcaa";
		
		boolean ana = anagram(str1, str2);
		
		System.out.println(ana);
	}

	private static boolean anagram(String str1, String str2) {
		// TODO Auto-generated method stub
		
		if(str1.length()!=str2.length()) return false;
		
		int[] arr = new int[256];
		
		for(char c : str1.toCharArray()){
			arr[c] += 1;
		}
		
		for(char c : str2.toCharArray()){
			arr[c] -= 1;
		}
		
		for(int i: arr){
			if(i!=0){
				return false;
			}
		}
		return true;


	}

	private static boolean Palindrome(String str1, String str2) {
		// TODO Auto-generated method stub
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1 != len2){
			return false;
		}else{
			for(int i=0;i<len1;i++ ){
				char a = str1.charAt(i);
				char b = str2.charAt(len1-i-1);
				
				if(a!=b){
					return false;
				}
			}
		}
		return true;
		

	}
}