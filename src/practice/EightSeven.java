package practice;

public class EightSeven {
	
	/*
		Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents) and
		pennies (1 cent), write code to calculate the number of ways of representing n cents.
	*/

	public static void main(String[] args){
		int n = 10;

		for(int i=1;i<100;i++){
			//System.out.println("Cents" + i + "---"+ makeChange(i, 25));
		}
		
		for(int i=1;i<100;i++){
			System.out.println("Cents" + i + "---"+ makeChange2(i));
		}
	}

	public static int makeChange2(int n) {
		
		int num = 0;
		for(int i=0;i*25<=n;i++){
			int na = n-i*25;
			for(int j=0;j*10<=na;j++){
				int nb = na-j*10;
				for(int k=0;k*5<=nb;k++){
					num++;
				}
			}
		}
		return num;

	}
	
	public static int makeChange(int n, int denom) {
		int next = 0;
		switch(denom){
		case 25:
			next = 10;
			break;
		case 10:
			next = 5;
			break;
		case 5:
			next = 1;
			break;
		case 1:
			return 1;
		}
		
		int num = 0;
		for(int i=0;i*denom<=n;i++){
			num += makeChange(n - i*denom, next);
		}
		
		return num;
	}

}