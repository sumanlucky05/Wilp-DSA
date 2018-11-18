package com.wilp.bits.pilani.dsa.BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


public class BSTTree {


	
	private void storeInorder(Node root, List<Integer> v) 
	{ 
	    if (root == null) 
	        return; 
	    storeInorder(root.leftChild, v); 
	    v.add(root.data); 
	    storeInorder(root.rightChild, v); 
	}
	
	private void storePreorder(Node root, List<Integer> v) 
	{ 
	    if (root == null) 
	        return; 
	    v.add(root.data);
	    storePreorder(root.leftChild, v); 
	    storePreorder(root.rightChild, v); 
	}
	
	private void storePostOrder(Node root, List<Integer> v) 
	{ 
	    if (root == null) 
	        return; 
	    storePostOrder(root.leftChild, v); 
	    storePostOrder(root.rightChild, v);
	    v.add(root.data);
	}
	
	/**
	 * Returns true if BST have the exact same structure.
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean checkBSTs(Node root1, Node root2) 
	{  
	    // Base cases  
	    if (root1 == null && root2 == null)  
	        return true; 
	    if ((root1 != null && root2 == null) || (root1 == null && root2!=null)) 
	        return false; 
	          
	    // Create two vectors and store  
	    // inorder traversals of both BSTs  
	    // in them. 
	    List<Integer> v1= new ArrayList<>();
	    List<Integer> v2= new ArrayList<>();
	    storeInorder(root1, v1); 
	    storeInorder(root2, v2); 
	    
	    boolean isTrueInorder=v1.equals(v2);
	    
	    v1= new ArrayList<>();
	    v2= new ArrayList<>();
	    storePreorder(root1, v1); 
	    storePreorder(root2, v2);
	    
	    boolean isTruePreorder=v1.equals(v2);
	    
	    v1= new ArrayList<>();
	    v2= new ArrayList<>();
	    storePostOrder(root1, v1); 
	    storePostOrder(root2, v2);
	    
	    boolean isTruePostorder=v1.equals(v2);
	    // Return true if both vectors are 
	    // identical 
	    return (isTrueInorder && isTruePreorder && isTruePostorder); 
	} 
	
	/**
	 * Returns true if BST are identical
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean checkIdenticalBSTs(Node root1, Node root2) 
	{  
	    if (root1 == null && root2 == null)  
	        return true; 
	    if ((root1 != null && root2 == null) || (root1 == null && root2!=null)) 
	        return false; 
	          
	    
	    List<Integer> v1= new ArrayList<>();
	    List<Integer> v2= new ArrayList<>();
	    storeInorder(root1, v1); 
	    storeInorder(root2, v2); 
	    
	    boolean isTrueInorder=v1.equals(v2);
	    
	    
	    return isTrueInorder; 
	} 
	
	public Node constructBST(List<Integer> bstList) {
		Node bstTree = null;
		int i=0;
		if(bstList != null) {
			for(int child: bstList) {
				if(i == 0) {
					bstTree= new Node(child);
					i++;
				}
				else{
					contructBSTFromNode(bstTree,child);
				}
			}
		}
		return bstTree;
		
	}

	private Node contructBSTFromNode(Node bstTree, int child) {
		if(child <= bstTree.data) {
			if(bstTree.leftChild == null) {
				bstTree.leftChild= new Node(child);
			}
			else {
				contructBSTFromNode(bstTree.leftChild,child);
			}
		}
		else if(child > bstTree.data) {
			if(bstTree.rightChild == null) {
				bstTree.rightChild= new Node(child);
			}
			else {
				contructBSTFromNode(bstTree.rightChild,child);
			}
		}
		return bstTree;
		
	}
	
}
