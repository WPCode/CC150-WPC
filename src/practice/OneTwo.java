package practice;

public class OneTwo {
	
	/*
		Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
    	five characters, including the null character.)
	*/

	public static void main(String[] args){
		//String[] words = {"abcde", "hello", "apple", "kite", "padle", "a"};
		
		char[] word0 = {'a', ' ', 'b', 'c', '\0'};
        char[] word = {'1','2','3','3','1','5','\0'};

		System.out.println(word);
		reverse0(word);
		System.out.println(word);

	}

	private static void reverse0(char[] word) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = word.length - 2;
		
		while(i < j){
			char a = word[i];
			word[i] = word[j];
			word[j] = a;
			i++;
			j--;
		}
		
		
	}

	private static String reverse(String word) {
		// TODO Auto-generated method stub
		String str = "";
		
		for(int i = 0; i < word.length() ; i++){
			str = word.charAt(i) + str;
		}
		return str;
	}
}