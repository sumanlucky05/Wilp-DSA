package com.wilp.bits.pilani.dsa;
import java.util.Stack;

public class BTree {

	Node rootNode; 

	//function to print the 
	//zigzag traversal 
	void printZigZagTraversal() { 
		
		// if null then return 
		if (rootNode == null) { 
		return; 
		} 

		// declare two stacks 
		Stack<Node> currentLevel = new Stack<>(); 
		Stack<Node> nextLevel = new Stack<>(); 

		// push the root 
		currentLevel.push(rootNode); 
		boolean leftToRight = true; 

		// check if stack is empty 
		while (!currentLevel.isEmpty()) { 

		// pop out of stack 
		Node node = currentLevel.pop(); 
		
		// print the data in it 
		System.out.print(node.data + " "); 

		// store data according to current 
		// order. 
		if (leftToRight) { 
			if (node.leftChild != null) { 
			nextLevel.push(node.leftChild); 
			} 
			
			if (node.rightChild != null) { 
			nextLevel.push(node.rightChild); 
			} 
		} 
		else { 
			if (node.rightChild != null) { 
			nextLevel.push(node.rightChild); 
			} 
			
			if (node.leftChild != null) { 
			nextLevel.push(node.leftChild); 
			} 
		} 

		if (currentLevel.isEmpty()) { 
			leftToRight = !leftToRight; 
			Stack<Node> temp = currentLevel; 
			currentLevel = nextLevel; 
			nextLevel = temp; 
		} 
		} 
	} 
}
