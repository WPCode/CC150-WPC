package practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import myLibrary.TreeNode;

public class FourFive {
	
	/*
		Write an algorithm to find the ‘next’ node (i.e., in-order successor) of a given node in
		a binary search tree where each node has a link to its parent.

	*/

	public static void main(String[] args){
		TreeNode root = new TreeNode(0);
		createTree(root);
		printTreeLevelOrder(root);
		
		TreeNode node = root.right.right;
		
		TreeNode nn = findNextNodeInOrder(node);
		System.out.println();
		if(nn==null){
			System.out.println("null");
		}else{
			System.out.println(nn.data);
		}
	}

	private static TreeNode findNextNodeInOrder(TreeNode node) {
		if(node!=null){
			if(node.parent==null || node.right!=null){
				TreeNode n = findLeftMostNode(node.right);
				return n;
			}else{
				TreeNode p = node.parent;
				while(node!=p.left){
					node = p;
					p = p.parent;
					if(p == null){
						break;
					}
				}
				return p;
			}
		}
		return null;
	}

	private static TreeNode findLeftMostNode(TreeNode right) {
		// TODO Auto-generated method stub
		while(right.left!=null){
			right = right.left;
		}
		return right;
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
	
	private static TreeNode createTree(TreeNode root) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3,4,5,6,7,8,9};
		
		TreeNode node1 = new TreeNode(array[0]);
		TreeNode node2 = new TreeNode(array[1]);
		TreeNode node3 = new TreeNode(array[2]);
		TreeNode node4 = new TreeNode(array[3]);
		TreeNode node5 = new TreeNode(array[4]);
		TreeNode node6 = new TreeNode(array[5]);
		TreeNode node7 = new TreeNode(array[6]);
		TreeNode node8 = new TreeNode(array[7]);
		TreeNode node9 = new TreeNode(array[8]);


		root.setLeftChild(node1);
		root.setRightChild(node2);
		node1.setLeftChild(node3);
		node1.setRightChild(node4);		
		node2.setLeftChild(node5);
		node2.setRightChild(node6);
		node3.setLeftChild(node7);
		node3.setRightChild(node8);
		node6.setLeftChild(node9);

		return root;
	}
}