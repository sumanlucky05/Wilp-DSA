package com.wilp.bits.pilani.dsa.BST;

import java.util.Arrays;
import java.util.List;

public class BSTValidator {

	public static void main(String[] args) 
	{ 
		BSTTree tree = new BSTTree(); 
		
		List<Integer> bst1 = Arrays.asList(3, 5, 4, 6, 1, 0, 2);   
		List<Integer> bst2 = Arrays.asList(3, 1, 5, 2, 4, 6, 0);   
		List<Integer> bst3 = Arrays.asList(3, 2, 5, 1, 4, 6, 0); 
		
		Node bstTree1= tree.constructBST(bst1);
		Node bstTree2= tree.constructBST(bst2);
		Node bstTree3= tree.constructBST(bst3);
		
		boolean checkCombo1= tree.checkBSTs(bstTree1, bstTree2);
		boolean checkCombo2= tree.checkBSTs(bstTree1, bstTree3);

		if(checkCombo1)
			System.out.println("Bst "+ bst1+" and "+bst2+" have same structure");
		else
			System.out.println("Bst "+ bst1+" and "+bst2+" do not have same structure");
		
		if(checkCombo2)
			System.out.println("Bst "+ bst1+" and "+bst3+" have same structure");
		else
			System.out.println("Bst "+ bst1+" and "+bst3+" do not have same structure");
		
		List<Integer> bst4 = Arrays.asList(10, 5, 20, 15, 30);   
		List<Integer> bst5 = Arrays.asList(10, 20, 15, 30, 5);   
		List<Integer> bst6 = Arrays.asList(10, 5, 30, 20, 5); 
		
		Node bstTree4= tree.constructBST(bst1);
		Node bstTree5= tree.constructBST(bst2);
		Node bstTree6= tree.constructBST(bst3);
		
		boolean checkCombo3= tree.checkBSTs(bstTree4, bstTree5);
		boolean checkCombo4= tree.checkBSTs(bstTree4, bstTree6);
		
		if(checkCombo3)
			System.out.println("Bst "+ bst4+" and "+bst5+" have same structure");
		else
			System.out.println("Bst "+ bst4+" and "+bst5+" do not have same structure");
		
		if(checkCombo4)
			System.out.println("Bst"+ bst4+" and "+bst6+" have same structure");
		else
			System.out.println("Bst"+ bst4+" and "+bst6+" do not have same structure");
		
		boolean checkCombo5=tree.checkBSTs(bstTree4, bstTree5);
		boolean checkCombo6= tree.checkBSTs(bstTree4, bstTree6);
		
		if(checkCombo5)
			System.out.println("Bst "+ bst4+" and "+bst5+" are identical");
		else
			System.out.println("Bst "+ bst4+" and "+bst5+" are not identical");
		
		if(checkCombo6)
			System.out.println("Bst"+ bst4+" and "+bst6+" are identical");
		else
			System.out.println("Bst"+ bst4+" and "+bst6+" are not identical");
		
	} 
}
