package practice;

import java.util.Arrays;

public class NineOne {
	
	/*
		You are given two sorted arrays, A and B, and A has a large enough buffer at the end
		to hold B. Write a method to merge B into A in sorted order.
	*/

	public static void main(String[] args){
		int[] A = new int[30];
		int[] B = new int[10];
		
		for(int i=0;i<10;i++){
			A[i] = i;
		}
		
		for(int i=0;i<10;i++){
			B[i] = i+4;
		}
		
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		
		int m=10, n=10;
		merge(A, B, m, n);
		System.out.println(Arrays.toString(A));

		
	}

	private static void merge(int[] a, int[] b, int i, int j) {

		int index = i + j -1;
		int m = i-1;
		int n = j-1;
		
		while(m>=0&&n>=0){
			if(a[m]>b[n]){
				a[index--] = a[m--];
			}else{
				a[index--] = b[n--];
			}
		}
		
		while(n>=0){
			a[index--] = a[n--];
		}
		
	}

}