package practice;

public class FiveOne {
	
	/*
		You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a
		method to set all bits between i and j in N equal to M (e.g., M becomes a substring of
		N located at i and starting at j).
		EXAMPLE:
		Input: N = 10000000000, M = 10101, i = 2, j = 6
		Output: N = 10001010100

	*/

	public static void main(String[] args){
		int N = 0b101000;
		int M = 0b111;
		int i = 1;
		int j = 3;
		
		int mask = ~0;
		
		//for(int k = i; k <= j; k++){
		//	mask ^= 1 << k;
		//}
	
		int left = mask - ((1 << (j+1)) - 1);

		
		int right = (1 << i) - 1;
		
		mask = left | right;
		System.out.println(Integer.toBinaryString(left));
		System.out.println(Integer.toBinaryString(right));
		System.out.println(Integer.toBinaryString(mask));

		/*
		 * This can also be done in another method:
		 * 		int left = mask - ((1 << j) - 1);
		 * 		int right = (1 << i) - 1;
		 */
		System.out.println(Integer.toBinaryString(N));

		N &= mask;
		System.out.println(Integer.toBinaryString(N));

		N |= M << i;
		System.out.println(Integer.toBinaryString(N));
	}
}