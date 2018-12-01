package org.study.algos.trees;

class BstNode {
	int data;
	BstNode left;
	BstNode right;
}

public class SortedArrayToBST {
	public static void main(String[] args) {
		
		int[] array = {1,2,3};
		SortedArrayToBST satb = new SortedArrayToBST();
		BstNode root = satb.convert(array, 0, array.length-1);
		satb.inorderTraversal(root);
		System.out.println(satb.getDepth(root));
		
	}

	public BstNode convert(int[] array, int low, int high) {
		if(low<=high) {
			int middle = (low+high)/2;
			BstNode node = new BstNode();
			node.data = array[middle];
			node.left = convert(array, low, middle-1);
			node.right = convert(array, middle+1, high);
			return node;
		}
		else
			return null;
	}
	
	public void inorderTraversal(BstNode root) {
		if(root.left!=null) {
			inorderTraversal(root.left);
		}
		System.out.println(root.data);
		if(root.right!=null) {
			inorderTraversal(root.right);
		}	
	}
	
	/**
	 * Get the maximum depth of a binary search tree
	 * @param root : the root of the binary search tree
	 * @return : depth
	 */
	private int getDepth(BstNode root) {
		if(root==null)
			return 0;
		else {
			int left = getDepth(root.left);
			int right = getDepth(root.right);
			
			if(left>right)
				return left+1;
			else
				return right+1;
		}
		
	}
}
