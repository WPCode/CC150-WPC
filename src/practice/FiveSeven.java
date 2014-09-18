package practice;

import java.util.ArrayList;

public class FiveSeven {
	
	/*
		An array A[1...n] contains all the integers from 0 to n except for one number which is
		missing. In this problem, we cannot access an entire integer in A with a single opera-
		tion. The elements of A are represented in binary, and the only operation we can use
		to access them is “fetch the jth bit of A[i]”, which takes constant time. Write code to
		   find the missing integer. Can you do it in O(n) time?
	*/

	public static void main(String[] args){
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int n=123211;
		for(int i=0;i<=n;i++){
			arr.add(i);
		}
		arr.remove(112);

		int miss = getMissingNum(arr, n);
		System.out.println(miss);
		
		long miss2 = getMissingNum2(arr, n);
		System.out.println(miss2);
		
	}

	// some issues..... if num is too big, problems come......
	private static long getMissingNum2(ArrayList<Integer> arr, int n) {

		long sum = (n+1)*n/2;
		
		for(int i=0;i<arr.size();i++){
			int c = arr.get(i);
			int f = 1;
			for(int j=0;j<32;j++){
				sum -= ((c>>j)&1)*f;
				f <<= 1;
			}
		}
		return sum;
	}

	private static int getMissingNum(ArrayList<Integer> arr, int n) {
		int num = 0;
		for(int i=0;i<arr.size();i++){
			num = num^arr.get(i);
		}
		
		for(int i=0;i<=n;i++){
			num = num^i;
		}		
		return num;
	}

	public static String toFullBinaryString(int a) {
		String s = "";
		for (int i = 0; i < 32; i++) {
			Integer lsb = new Integer(a & 1);
			s = lsb.toString() + s;
			a = a >> 1;
		}
		return s;
	}
}