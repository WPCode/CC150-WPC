package practice;

import java.util.ArrayList;

import myLibrary.TreeNode;

public class FourEight {
	
	/*
		You are given a binary tree in which each node contains a value. Design an algorithm
		to print all paths which sum up to that value. Note that it can be any path in the tree
		- it does not have to start at the root.
	*/

	public static void main(String[] args){
	
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(8);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(6);
		
		findSum(root, 8, new ArrayList<Integer>(), 0);
		
	}

	public static void findSum(TreeNode root, int n, ArrayList<Integer> buffer, int d) {
		
		System.out.println(buffer);
		if(root==null) return;
		
		int temp = 0;
		
		buffer.add(root.data);
		for(int i=d;i>-1;i--){
			temp += buffer.get(i);
			if(temp == n) printPath(buffer, i, d);
		}
		
		ArrayList<Integer> c1 = (ArrayList<Integer>) buffer.clone();
		ArrayList<Integer> c2 = (ArrayList<Integer>) buffer.clone();
		
		findSum(root.left, 8, c1, d+1);
		findSum(root.right, 8, c2, d+1);
	}
	
	public static void printPath(ArrayList<Integer> buffer, int i, int j){
		
		for(int m=i;m<=j;m++){
			System.out.print(buffer.get(m) + " ");
		}
		System.out.println();
	}
}