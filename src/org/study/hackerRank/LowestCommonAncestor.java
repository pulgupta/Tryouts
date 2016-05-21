package org.study.hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LowestCommonAncestor {
	class Node {
		int data;
		Node left;
		Node right;
	}
	
	//Using the stack to remember the node
	//Put the current element as a prospective solution
	//Search its child if v1 or v2 is not found move to next and add the 
	//current to the stack
	//Repeat the process when v1 or v2 found remember the parent and pop parent\
	//whom we have visited and have not found the elements
	
	static List<Node> path(Node root, int v1) {
		Stack<Node> list = new Stack<>();
		while(root!=null) {
			list.push(root);
			root = root.left;			
		}
		while(!list.isEmpty()){
			Node temp = list.pop();
			//if(temp.right!=null)
		}
		return null;
	}
	static Node lca(Node root, int v1, int v2) {
		
		Stack<Integer> stack = new Stack<>();
		if(root!=null) {
			if(root.data == v1 || root.data == v2){
				
			}
		}
		
		
		return null;
	}
	
	public static void main(String[] args) {
		
	}
}
