package myLibrary;

public class TreeNode{
	
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode parent;
	
	public TreeNode(int n){
		this.data = n;
	}
	
	public void setLeftChild(TreeNode left){
		this.left = left;
		if(left != null){
			left.parent = this;
		}
	}
	
	public void setRightChild(TreeNode right){
		this.right = right;
		if(right != null){
			right.parent = this;
		}
	}
	
	public void insertInOrder(int d){
		
		TreeNode begin = this;
		TreeNode paren = begin;
		
		while(begin != null){
			paren = begin;
			if(d <= this.data){
				begin = begin.left;
			}else{
				begin = begin.right;
			}
		}
		
		if(paren.left == null && paren.right != null){
			
		}else{
			
		}
	}
	
	
	
	
}