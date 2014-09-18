package practice;

public class OneThree {
	
	/*
		Design an algorithm and write code to remove the duplicate characters in a string
		without using any additional buffer. NOTE: One or two additional variables are fine.
		An extra copy of the array is not.
		FOLLOW UP
		Write the test cases for this method.

	*/

	public static void main(String[] args){
		String[] words = {"","aaaa", "helloiloveyou", "hello", "apple", "kite", "padle"};
		for(String str:words){
			System.out.print(str + " : ");
			char[] arr = str.toCharArray();
			removeDup2(arr);
			System.out.println(new String(arr));

		}
	}

	private static void removeDup2(char[] arr) {
		// TODO Auto-generated method stub
		if (arr == null) return;

		boolean[] check = new boolean[256];
		
		int j=0;
		for(int i=0;i<arr.length;i++){
			char c = arr[i];
			if(!check[c]){
				arr[j] = arr[i];
				j++;
				check[c]=true;
			}
		}
		//this is important which doesn't exist in solution
		if(j<arr.length) arr[j]=0;
		
	}

	private static void removeDup(char[] ch) {
		// TODO Auto-generated method stub
		if (ch == null) return;

		if(ch.length < 2){
			return;
		}
		
		int tail = 1;
		for(int i=1;i<ch.length;i++){
			int j;
			for(j=0;j<tail;j++){
				if(ch[i]==ch[j]){
					break;
				}
			}
			
			if(j==tail){
				ch[tail]=ch[i];
				tail++;
			}
		}
		if(tail<ch.length) ch[tail]=0;
	}
}