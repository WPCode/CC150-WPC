package practice;

public class EightFive {
	
	/*
		Implement an algorithm to print all valid (e.g., properly opened and closed) combi-
		nations of n-pairs of parentheses.
		EXAMPLE:
		input: 3 (e.g., 3 pairs of parentheses)
		output: ()()(), ()(()), (())(), ((()))
	*/

	public static void main(String[] args){
		int n = 3;
		char[] ch = new char[2*n];
		printAllComb(ch, 0, n, n);
	}

	static int count = 1;
	private static void printAllComb(char[] ch, int i, int l, int r) {

		if(l>r) return;
		
		if(l==0&&r==0){
			System.out.println(ch);
		}
		
		if(l>0){
			System.out.println(count++ + "-l-" + l);
			ch[i] = '(';
			printAllComb(ch, i+1, l-1, r );
		}

		if(r>0){
			System.out.println(count++ + "-r-" + r);
			ch[i] = ')';
			printAllComb(ch, i+1, l, r-1 );
		}
	}

}