package practice;

import myLibrary.MyMethods;

public class FiveThree {
	
	/*
		Given an integer, print the next smallest and next largest number that have the same
		number of 1 bits in their binary representation.

	*/

	public static void main(String[] args){
		int num = 273;
		
		int nextS = nextSmallest(num);
		int nextB = nextLargest(num);
		
		
		System.out.println(num + " : " + MyMethods.toFullBinaryString(num));

		System.out.println(nextS + " : " + MyMethods.toFullBinaryString(nextS));
		System.out.println(nextS + " : " + MyMethods.toFullBinaryString(nextB));

	}
	
	public static int nextLargest(int num) {
		
		int index=0;
		int numZero=0;
		// first 0
		while((num&(1<<index)) > 0){
			index++;
		}
		//next 0;
		while((num&(1<<index)) == 0){
			index++;
			numZero++;
		}
		
		num = setBit(num, index, false);
		index--;
		num = setBit(num, index, true);
		numZero--;
		
		for (int i = index - 1; i >= numZero; i--) {
			num = setBit(num, i, true);
		}
		System.out.println(numZero);
		for(int i=numZero-1;i>=0;i--){
			num=setBit(num, i, false);
		}
		
		return num;
	}

	public static int nextSmallest(int num) {
		
		int index=0;
		int numOne=0;
		// first 1
		while((num&(1<<index)) == 0){
			index++;
		}
		//next 0;
		while((num&(1<<index)) > 0){
			numOne++;
			index++;
		}

		num = setBit(num, index, true);
		index--;
		num = setBit(num, index, false);
		numOne--;

		for (int i = index - 1; i >= numOne; i--) {
			num = setBit(num, i, false);
		}

		for(int i=numOne-1;i>=0;i--){
			num=setBit(num, i, true);
		}
		return num;
	}
	
	public static int setBit(int n, int index, boolean b ){
		if(b){
			int a = 1<<index;
			n = n|a;
		}else{
			int a = 1<<index;
			n = n&(~a);
		}
		return n;
	}
}