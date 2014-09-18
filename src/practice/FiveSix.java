package practice;

public class FiveSix {
	
	/*
		Write a program to swap odd and even bits in an integer with as few instructions as
		possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, etc).
	*/

	public static void main(String[] args){
		
		int a = 234;
		
		System.out.println(Integer.toBinaryString(a));
		
		int b = swapOddEven(a);
		System.out.println(Integer.toBinaryString(b));

	}

	private static int swapOddEven(int a) {
		
		return 	((a&0xaaaaaaaa)>>1) | ((a&0x55555555)<<1);
	}

}