package practice;

import java.util.ArrayList;
import java.util.Random;

import myLibrary.MyMethods;

public class EightTwo {
	
	/*
		Imagine a robot sitting on the upper left hand corner of an NxN grid. The robot can
		only move in two directions: right and down. How many possible paths are there for
		the robot?
		FOLLOW UP
		Imagine certain squares are “off limits”, such that the robot can not step on them.
		Design an algorithm to get all possible paths for the robot.

	*/

	public static void main(String[] args){

		MyMethods.printMatrix(maze);
		
		int pathNum = computeAllPaths(10, 0, 0);
		System.out.println(pathNum);
		
		
		getPath(0, 0);
		
		System.out.println(arr);
		
	}
	static int N = 10;
	static int[][] maze = createMatrix(N);
	static ArrayList<Integer> arr = new ArrayList<Integer>();

	private static boolean getPath(int i, int j) {

		int a = maze[i][j];
		arr.add(a);

		if(i==N-1&&j==N-1){
			return true;
		}
		boolean success = false;

		if(i<N-1&&isValid(maze[i+1][j])){
			success = getPath(i+1, j);
		}
		
		if(!success&&j<N-1&&isValid(maze[i][j+1])){
			success = getPath(i, j+1);
		}

		if (!success) {
			arr.remove(a);
		}
		
		return success;
	}
	
	public static boolean isValid(int a){
		return a!=0;
	}
	
	private static int computeAllPaths(int n, int i, int j) {
		
		if(i==n-1 || j==n-1){
			return 1;
		}
		return computeAllPaths(n, i+1, j) + computeAllPaths(n, i, j+1);
	}

	private static int[][] createMatrix(int N) {
		int[][] maze = new int[N][N];
		Random rand = new Random();
		for(int i=0;i<maze.length;i++){
			for(int j=0;j<maze[0].length;j++){
				maze[i][j] = rand.nextInt(10);
			}
		}
		return maze;
	}

}