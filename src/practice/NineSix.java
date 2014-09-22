package practice;

import java.awt.Point;

import myLibrary.MyMethods;

public class NineSix {
	
	/*
		Given a matrix in which each row and each column is sorted, write a method to find
		an element in it.
	*/

	public static void main(String[] args){
		int M = 10;
		int N = 5;
		int[][] matrix = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = 10 * i + j;
			}
		}
		
		MyMethods.printMatrix(matrix);

		for (int i = 0; i < 100; i++) {
				int elem = i;
				System.out.println(findElem(matrix, elem));
		}
		
		for (int i = 0; i < 100; i++) {
			//System.out.println(findElem2(matrix, i, 0, M-1, 0, N-1));
		}

	}

	
	//not working!!!!!!
	public static Point findElem2(int[][] matrix, int num, int a, int b, int m, int n) {

		if(a==b&&m==n) return new Point(a,m);
		
		while(a<=b&&m<=n){
			int m1 = (a+b)/2;
			int m2 = (m+n)/2;
			
			int n1 = matrix[a][m];
			int n2 = matrix[m1][m2];
			
			int n3 = matrix[a][m2];
			int n4 = matrix[m1][n];
			
			int n5 = matrix[m1][m];
			int n6 = matrix[b][m2];
			
			int n7 = matrix[m1][m2];
			int n8 = matrix[b][n];
			
			if(num>n1&&num<n2){
				findElem2(matrix, num, a, m1-1, m, m2-1);
			}else if(num>n3&&num<n4){
				findElem2(matrix, num, a, m1-1, m2+1, n);
			}else if(num>n5&&num<n6){
				findElem2(matrix, num, m1+1, b, m, m2-1);
			}else if(num>n7&&num<n8){
				findElem2(matrix, num, m1+1, b, m2+1, n);
			}
			
		}
		return null;
	}
	
	
	public static Point findElem(int[][] matrix, int n) {

		int a = 0;
		int b = matrix[0].length-1;
		
		while(a<matrix.length&&b>=0){
			if(matrix[a][b]==n){
				return new Point(a, b);
			}else if(matrix[a][b]>n){
				b--;
			}else{
				a++;
			}
		}
		return null;
		
	}

}