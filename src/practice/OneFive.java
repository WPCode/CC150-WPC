package practice;

import java.util.Arrays;

public class OneFive {
	
	/*
		Write a method to replace all spaces in a string with ‘%20’.
	*/

	/*
	 *  1. StringBuffer
	 *  2. char[] 
	 *  3. substring
	 */ 
	
	
	public static void main(String[] args){
		String word = "abc d e f";
		System.out.println(word);
		//replace(word);
		System.out.println(replace3(word));
	}

	private static String replace3(String word) {
		// TODO Auto-generated method stub
		int space = 0;
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)==' '){
				space += 1;
			}
		}
		int num = word.length() + 2*space + 1;
		char[] newword = new char[num];
		newword[num - 1] = '\0';
		
		int j = 0;
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)==' '){
				newword[j]='%';
				newword[j+1]='2';
				newword[j+2]='0';
				j=j+3;
			}else{
				//System.out.println(j);
				newword[j]=word.charAt(i);
				j=j+1;
			}
		}
		System.out.println(newword.length);

		return new String(newword);
	}

	private static String replace2(String word) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)==' '){
				sb.append("%20");
			}else{
				sb.append(word.charAt(i));
			}
		}
		return sb.toString();

	}

	private static String replace(String word) {
		// TODO Auto-generated method stub
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)==' '){
				word = word.substring(0, i) + "%20" + word.substring(i+1);
			}
		}
		return word;
	}
}