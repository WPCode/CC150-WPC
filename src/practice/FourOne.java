package practice;

import java.util.Random;

import myLibrary.TreeNode;

public class FourOne {
	
	/*
		Implement a function to check if a tree is balanced. For the purposes of this question,
		a balanced tree is defined to be a tree such that no two leaf nodes differ in distance
		from the root by more than one.
	*/

	
	private static boolean checkIfBalanced(TreeNode root) {
		// TODO Auto-generated method stub
		int maxi = maxDepth(root);
		int mini = minDepth(root);
		int diff = maxi - mini;
		System.out.println(maxi);
		System.out.println(mini);
		
		if(diff > 1){
			return false;
		}else{
			return true;
		}
	}
	
	private static int minDepth(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null){
			return 0;
		}else{
			/*
			int l = minDepth(root.left);
			int r = minDepth(root.right);
			if(l == 0){
				return r + 1;
			}
			if(r == 0){
				return l + 1;
			}
			return 1 + Math.min(l, r);
			*/
			return 1 + Math.min(maxDepth(root.left), maxDepth(root.right));

		}
	}

	private static int maxDepth(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null){
			return 0;
		}else{
			return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
		}
	}

	public static void main(String[] args){
		int rootValue = 3;
		TreeNode root = new TreeNode(rootValue);
		//createBalanceTree(root);
		//System.out.println(checkIfBalanced(root));
		createUnbalanceTree(root);
		System.out.println(checkIfBalanced(root));

	}

	/*            3
	 *          4   1
	 *        2  5 6  4
	 *       1 9
	 */
	
	private static void createBalanceTree(TreeNode root) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		TreeNode n1 = new TreeNode(rand.nextInt(9) + 1);
		TreeNode n2 = new TreeNode(rand.nextInt(9) + 1);
		TreeNode n3 = new TreeNode(rand.nextInt(9) + 1);
		TreeNode n4 = new TreeNode(rand.nextInt(9) + 1);

		root.left = n1;
		root.right = n2;
		n1.parent = root;
		n2.parent = root;
		
		n1.left = n3;
		n1.right = n4;
		n3.parent = n1;
		n4.parent = n1;
		
	}

	private static void createUnbalanceTree(TreeNode root) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		TreeNode n1 = new TreeNode(rand.nextInt(9) + 1);
		TreeNode n2 = new TreeNode(rand.nextInt(9) + 1);
		TreeNode n3 = new TreeNode(rand.nextInt(9) + 1);
		TreeNode n4 = new TreeNode(rand.nextInt(9) + 1);
		TreeNode n5 = new TreeNode(rand.nextInt(9) + 1);

		root.left = n1;
		n1.parent = root;
		
		n1.left = n3;
		n3.parent = n1;
		
		n3.left = n5;
		n5.parent = n3;
	}
}