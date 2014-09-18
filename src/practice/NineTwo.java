package practice;

import java.util.Arrays;

import myLibrary.AnagramComparator;

public class NineTwo {
	
	/*
		Write a method to sort an array of strings so that all the anagrams are next to each
		other.
	*/

	public static void main(String[] args){
		String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};

		
		
		System.out.println(Arrays.toString(array));

		sortAnag2(array);
		
		System.out.println(Arrays.toString(array));

	}

	private static void sortAnag2(String[] array) {

		Arrays.sort(array, new AnagramComparator());
	}

	private static void sortAnag(String[] array) {

		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				int n = i+1;
				if(checkIfAnagrams(array[i], array[j])){
					String a = array[j];
					array[j] = array[n];
					array[n] = a;
				}
			}
		}
		
	}

	public static boolean checkIfAnagrams(String a, String b){
		
		char[] m = a.toCharArray();
		char[] n = b.toCharArray();

		Arrays.sort(m);
		Arrays.sort(n);

		return new String(m).equals(new String(n));
	}
	
}