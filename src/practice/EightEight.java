package practice;

public class EightEight {
	
	/*
		Write an algorithm to print all ways of arranging eight queens on a chess board so
		that none of them share the same row, column or diagonal.
	*/

	static int N=8;
	static int[] cfr = new int[N];
	static int Num = 0;
	
	public static boolean check(int row){
		
		for(int i=0;i<row;i++){
			
			int diff = Math.abs(cfr[i] - cfr[row]);
			if(diff==0||diff==(row-i)){
				return false;
			}
		}
		return true;
	}
	
	
	private static void PlaceQueen(int r) {		
		if(r == N) {
			printBoard();
			return; 
		}
		
		for(int i=0;i<N;i++){
			cfr[r] = i;
			if(check(r)){
				PlaceQueen(r+1); 
			}
		}
	}
	
	private static void printBoard() {
		Num++;
		System.out.println("-----------------");
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(j==cfr[i])
					System.out.print("|Q");
				else
					System.out.print("| ");	
			}
			System.out.println("|");
			System.out.println("-----------------");
		}
		System.out.println("-----------------");
	}


	public static void main(String[] args){
		PlaceQueen(0);
		System.out.println(Num);
	}
}