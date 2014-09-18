package practice;

import java.util.Arrays;
import java.util.Random;

import myLibrary.MyMethods;

public class OneSix {
	
	/*
		Given an image represented by an NxN matrix, where each pixel in the image is 4
		bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
	*/
	
	public static void main(String[] args){
		Random rand = new Random();
		int N = 4;
		int[][] matrix = new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				matrix[i][j] = rand.nextInt(9)+1;
			}
		}
		MyMethods.printMatrix(matrix);

		rotate(matrix);
		System.out.println();
		MyMethods.printMatrix(matrix);

	}

	private static void rotate(int[][] matrix) {
		// TODO Auto-generated method stub
		
		int side = matrix.length;
		
		for(int layer = 0;layer<side/2;layer++){
			
			int first = layer;
			int end = side - layer - 1;
					
			for(int i=layer;i<end;i++){
				int offset = i - first;
				int top = matrix[layer][i];
				//left --> top
				matrix[layer][i] = matrix[end-offset][layer];
				//bottom --> left
				matrix[end-offset][layer] = matrix[end][end-offset];
				//right --> bottom
				matrix[end][end-offset] = matrix[i][end];
				//top --> right
				matrix[i][end] = top;
			}
		}
	}
}