package practice;

public class FiveFive {
	
	/*
		Write a function to determine the number of bits required to convert integer A to
		integer B.	
		Input: 31, 14
		Output: 2
	*/

	public static void main(String[] args){
		int a = 31;
		int b = 14;
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(findNumOfDiffBits(a,b));
	}

	private static int findNumOfDiffBits(int a, int b) {

		int n=0;
		
		while((a|b) != 0){
			
			if(((a&1)^(b&1))!=0){
				n++;
			}
			a = a>>1;
			b = b>>1;
		}
		
		return n;
	}

}