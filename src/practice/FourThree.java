package practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import myLibrary.TreeNode;

public class FourThree {
	
	/*
		Given a sorted (increasing order) array, write an algorithm to create a binary tree with
		minimal height.
	*/
	
	
	public static void main(String[] args){

		int[] array = {2,4,5,6,7,9,10};
		//System.out.println(Arrays.toString(arr));
	
		int r = 5;
		TreeNode root = new TreeNode(5);
		//createTree(root);
		
		
		TreeNode root2 = createTreeMinHeightBST(array, 0, array.length-1);
		
		printTreeLevelOrder(root2);
	}
	
	private static TreeNode createTreeMinHeightBST(int[] array, int start, int end) {
		
		if(start>end) return null;
		int middle = (start + end)/2;
		TreeNode root = new TreeNode(array[middle]);
		root.left = createTreeMinHeightBST(array, start, middle-1);
		root.right = createTreeMinHeightBST(array, middle+1, end);
		return root;
	}

	private static void printTreeLevelOrder(TreeNode root) {
		// TODO Auto-generated method stub
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode node = queue.remove();
			System.out.print(node.data + "-");
			if(node.left!=null) queue.add(node.left);
			if(node.right!=null) queue.add(node.right);
		}
	}

	private static void createTree(TreeNode root) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int[] array = new int[8];
		for(int i=0;i<8;i++){
			array[i]=rand.nextInt(9)+1;
		}
		System.out.println(Arrays.toString(array));
		
		TreeNode node1 = new TreeNode(array[0]);
		TreeNode node2 = new TreeNode(array[1]);
		TreeNode node3 = new TreeNode(array[2]);
		TreeNode node4 = new TreeNode(array[3]);
		TreeNode node5 = new TreeNode(array[4]);
		TreeNode node6 = new TreeNode(array[5]);
		TreeNode node7 = new TreeNode(array[6]);
		TreeNode node8 = new TreeNode(array[7]);

		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		node3.left = node7;
		node3.right = node8;
	}
	
	
}