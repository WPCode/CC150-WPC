package practice;

public class EightOne {
	
	/*
		Write a method to generate the nth Fibonacci number.
	*/

	public static void main(String[] args){
		int n = 10;
		int f = Fibo(n);
		for(int i = 1; i < 12; i++){
			System.out.println(Fibo2(i));
		}
	}
	
	//iterative
	private static int Fibo2(int n) {
		// TODO Auto-generated method stub
		if(n == 0) return 0;
		if(n < 0) return -1;
		int a = 1;
		int b = 1;
		for(int i = 3; i <= n; i++){
			int c = b;
			b = a + b;
			a = c;
		}
		return b;
	}
	//recursive
	private static int Fibo(int n) {
		// TODO Auto-generated method stub
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}else if(n < 0) {
			return -1;
		}else {
			return Fibo(n-1) + Fibo(n-2);
		}
			
	
	}
}