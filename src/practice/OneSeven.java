package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import myLibrary.MyMethods;

public class OneSeven {
	
	/*
		Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
		column is set to 0.
	*/
	
	public static void main(String[] args){
		Random rand = new Random();

		int M = 7;
		int N = 9;
		int[][] matrix = new int[M][N];
		
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				matrix[i][j] = rand.nextInt(10);
			}
		}
		
		MyMethods.printMatrix(matrix);
		replaceWithZero2(matrix);
		System.out.println();
		MyMethods.printMatrix(matrix);

	}

	private static void replaceWithZero2(int[][] matrix) {
		// TODO Auto-generated method stub
		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					row[i]=1;
					col[j]=1;
				}
			}
		}
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(row[i]==1||col[j]==1){
					matrix[i][j]=0;
				}
			}
		}
		
		
	}

	private static void replaceWithZero(int[][] matrix) {
		// TODO Auto-generated method stub
		HashMap<Integer, Boolean> hashRow = new HashMap<Integer, Boolean>();
		HashMap<Integer, Boolean> hashCol = new HashMap<Integer, Boolean>();
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					if(!hashRow.containsKey(i)){
						hashRow.put(i, true);
					}
					if(!hashCol.containsKey(j)){
						hashCol.put(j, true);
					}
				}
				
			}
		}
		
		Set set1 = hashRow.entrySet();
		Set set2 = hashCol.entrySet();

		Iterator iter1 = set1.iterator();
		Iterator iter2 = set2.iterator();

		while(iter1.hasNext()){
			Map.Entry pair = (Map.Entry)iter1.next();
			int r = (int) pair.getKey();
			for(int i=0;i<matrix[0].length;i++){
				matrix[r][i]=0;
			}
		}
		
		while(iter2.hasNext()){
			Map.Entry pair = (Map.Entry)iter2.next();
			int r = (int) pair.getKey();
			for(int i=0;i<matrix.length;i++){
				matrix[i][r]=0;
			}
		}
		
	}
}