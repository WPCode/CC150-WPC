package practice;

import java.util.ArrayList;

public class EightFour {
	
	/*
		Write a method to compute all permutations of a string.
	*/

	public static void main(String[] args){
		String str = "abcde";

		ArrayList<String> allPerms= computeAllPermus(str);
		
		String ns = str.substring(0,5) + 'q' + str.substring(5);

		System.out.println(allPerms);
	}

	private static ArrayList<String> computeAllPermus(String str) {

		ArrayList<String> allPerms = new ArrayList<String>();
		if(str==null){
			return null;
		}else if(str.length()==0){
			allPerms.add("");
			return allPerms;
		}else{
			char ch = str.charAt(0);
			ArrayList<String> remainPerms = computeAllPermus(str.substring(1));

			for(String s:remainPerms){
				for(int i=0;i<=s.length();i++){
					String ns = "";
					ns = s.substring(0,i) + ch + s.substring(i);
					allPerms.add(ns);
				}
			}
			return allPerms;
		}
		
	}

}