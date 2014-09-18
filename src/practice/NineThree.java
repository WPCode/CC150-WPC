package practice;

public class NineThree {
	
	/*
		Given a sorted array of n integers that has been rotated an unknown number of
		times, give an O(log n) algorithm that finds an element in the array. You may assume
		that the array was originally sorted in increasing order.
		EXAMPLE:
		Input: find 5 in array (15 16 19 20 25 1 3 4 5 7 10 14)
		Output: 8 (the index of 5 in the array)
	*/

	public static void main(String[] args){
		int[] a = {4, 5, 6, 7, 8, 9, 1, 2, 3};
		int n = 9;
		
		for(int i=0;i<a.length;i++){
			System.out.println(findIndex(a, a[i], 0, a.length-1));
		}
	}

	public static int findIndex(int[] a, int n, int i, int j) {
		
		while(i<=j){
			int mid = (i+j)/2;
			if(a[mid]==n){
				return mid;
			}else if(a[i]<a[j]){
				if(n>a[mid]){
					i=mid+1;
				}else{
					j=mid-1;
				}
			}else{
				if(a[mid]>a[i]){
					if(n>a[mid]){
						i=mid+1;
					}else if(n>=a[i]){
						j=mid-1;
					}else{
						i=mid+1;
					}
				}else{
					if(n<a[mid]){
						j=mid-1;
					}else if(n<=a[j]){
						i=mid+1;
					}else{
						j=mid-1;
					}
				}
			}
		}
		return -1;
	}
}