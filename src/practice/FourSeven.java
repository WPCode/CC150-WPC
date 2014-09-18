package practice;

import myLibrary.TreeNode;

public class FourSeven {
	
	/*
		You have two very large binary trees: T1, with millions of nodes, and T2, with hun-
		dreds of nodes. Create an algorithm to decide if T2 is a subtree of T1.
	*/

	public static void main(String[] args){
		
		TreeNode t1 = new TreeNode(0);
		TreeNode t2 = new TreeNode(1);
		TreeNode t3 = new TreeNode(2);

		t1 = createTree(t1);
		t2 = createSubTree(t2);
		t3 = createNotSubTree(t3);

		boolean isSub = chechIsSubtree(t1, t2);
		System.out.println(isSub);
		
		boolean isSub2 = chechIsSubtree(t1, t3);
		System.out.println(isSub2);
	}

	private static TreeNode createNotSubTree(TreeNode t3) {
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(6);
		TreeNode node3 = new TreeNode(9);
		TreeNode node4 = new TreeNode(8);

		t3.setLeftChild(node1);
		t3.setRightChild(node2);
		node2.setLeftChild(node3);
		//node1.setRightChild(node4);
		return t3;
	}

	private static TreeNode createSubTree(TreeNode t2) {
		
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(4);
		TreeNode node3 = new TreeNode(7);
		TreeNode node4 = new TreeNode(8);

		t2.setLeftChild(node1);
		t2.setRightChild(node2);
		node1.setLeftChild(node3);
		node1.setRightChild(node4);
		return t2;
	}

	private static boolean chechIsSubtree(TreeNode t1, TreeNode t2) {
		if(t2 == null) return true;
		if(t1 == null) return false;
		if(t1.data == t2.data){
			return checkIfMatch(t1, t2);
		}else{
			return chechIsSubtree(t1.left, t2)||chechIsSubtree(t1.right, t2);
		}	
	}

	private static boolean checkIfMatch(TreeNode t1, TreeNode t2) {

		if(t1==null&&t2==null) return true;

		if(t1==null||t2==null){
			return false;
		}
		
		if(t1.data != t2.data) 	return false;
		return checkIfMatch(t1.left, t2.left)&&checkIfMatch(t1.right, t2.right);

	}
	
	private static TreeNode createTree(TreeNode root) {

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