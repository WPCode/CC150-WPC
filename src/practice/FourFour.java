package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import myLibrary.MyMethods;
import myLibrary.SingleLinkedListNode;
import myLibrary.TreeNode;

public class FourFour {
	
	/*
		Given a binary search tree, design an algorithm which creates a linked list of all the
		nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists).
	*/

	public static void main(String[] args){
		
		TreeNode root = new TreeNode(0);
		root = createTree(root);
		
		int maxDepth = maxDepth(root);
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>(maxDepth);

		for(int i=0;i<maxDepth;i++){
			lists.add(new ArrayList());
		}
		//TreeNode node = root.left.right;
		TreeNode node = root;

		System.out.println(node.data + "-" + getDepth(node));
		
		createArrayListAtEachDepth(lists, root);

		for(int i=0;i<lists.size();i++){
			ArrayList nodei = lists.get(i);
			System.out.println(nodei);
		}
		
		ArrayList<SingleLinkedListNode> linkedlists = new ArrayList<SingleLinkedListNode>(maxDepth);

		createLinkedListAtEachDepth(lists, linkedlists);

		for(int i=0;i<linkedlists.size();i++){
			MyMethods.printSingleLinkedList(linkedlists.get(i));
		}
		
	}

	private static void createLinkedListAtEachDepth(ArrayList<ArrayList<Integer>> lists, ArrayList<SingleLinkedListNode> linkedlists) {
		
		
		for(int i=0;i<lists.size();i++){
			ArrayList<Integer> arr = lists.get(i);
			SingleLinkedListNode root = new SingleLinkedListNode(arr.get(0), null);

			SingleLinkedListNode node = root;
			for(int j=1;j<arr.size();j++){
				node.next = new SingleLinkedListNode(arr.get(j), null);
				node = node.next;
			}
			
			linkedlists.add(root);

		}
		
	}

	private static void createArrayListAtEachDepth(ArrayList<ArrayList<Integer>> lists, TreeNode root) {
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode node = queue.remove();
			int d = getDepth(node);
			lists.get(d).add(node.data);
			if(node.left!=null) queue.add(node.left);
			if(node.right!=null) queue.add(node.right);
		}
		
	}

	private static int getDepth(TreeNode node) {
		int d = 0;
		while(node.parent!=null){
			node = node.parent;
			d++;
		}
		return d;
	}

	private static int maxDepth(TreeNode root) {
		if(root == null){
			return 0;
		}
		
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
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