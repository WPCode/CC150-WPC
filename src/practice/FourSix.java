package practice;

import myLibrary.TreeNode;

public class FourSix {
	
	/*
		Design an algorithm and write code to find the first common ancestor of two nodes
		in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
		necessarily a binary search tree.
	*/

	public static void main(String[] args){
		TreeNode root = new TreeNode(0);
		root = createTree(root);
		System.out.println(root.left.right.data);

		TreeNode node1 = root.left.right;
		TreeNode node2 = root.left.left.left;
		
		TreeNode cnode = firstCommonAncestor2(root, node1, node2);
		System.out.println(cnode.data);

	}
	
	public static TreeNode firstCommonAncestor2(TreeNode root, TreeNode node1,	TreeNode node2) {
		
		boolean found = false;
		TreeNode n2 = node2;
		while(node1!=null){
			if(found){
				break;
			}
			node1 = node1.parent;
			n2 = node2.parent;
			while(n2!=null){
				if(node1==n2){
					found = true;
					break;
				}
				n2 = n2.parent;
			}
		}
		
		if(found) return n2;
		return null;
	}

	private static TreeNode firstCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
		
		if(covers(root.left, node1)&&covers(root.left, node2)){
			return firstCommonAncestor(root.left, node1, node2);
		}
		
		if(covers(root.right, node1)&&covers(root.right, node2)){
			return firstCommonAncestor(root.right, node1, node2);
		}
		
		return root;
	}
	
	public static boolean covers(TreeNode root, TreeNode p){
		if(root == null) return false;
		if(root == p) return true;
		return covers(root.left, p)||covers(root.right, p);
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