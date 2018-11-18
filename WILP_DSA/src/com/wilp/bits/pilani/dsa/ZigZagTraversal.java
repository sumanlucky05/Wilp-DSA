package com.wilp.bits.pilani.dsa;

import java.util.*; 


public class ZigZagTraversal {

	//driver program to test the above function 
	public static void main(String[] args) 
	{ 
		BTree tree = new BTree(); 
		tree.rootNode = new Node(1); 
		tree.rootNode.leftChild = new Node(2); 
		tree.rootNode.rightChild = new Node(3); 
		tree.rootNode.leftChild.leftChild = new Node(4); 
		tree.rootNode.leftChild.rightChild = new Node(5); 
		tree.rootNode.rightChild.leftChild = new Node(6); 
		tree.rootNode.rightChild.rightChild = new Node(7); 

		System.out.println("ZigZag Order traversal of binary tree is"); 
		tree.printZigZagTraversal(); 
	} 

}


//Java implementation of a O(n) time 
//method for Zigzag order traversal 



class BinaryTree { 

} 

