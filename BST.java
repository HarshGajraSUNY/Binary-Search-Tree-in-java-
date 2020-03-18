package com.code.bst;

public class BST {

	Node root;
	
	public void addNode(int key, String name)
	{
		Node newNode = new Node(key,name);
		
		if(root ==null) {
			root = newNode;
			System.out.println("root added is " + root.key);
		}else {
			
			Node currentNode = root;
			
			while(true) {
				
				Node parent = currentNode;
				
				if(key<currentNode.key) {
					
					currentNode = currentNode.left;
					
					if(currentNode ==null) {
					
						parent.left = newNode;
						System.out.println("node added is " + parent.left.key);
						return;
					}
					
				} //if key is greater  then move right
					else { 
					
					currentNode = currentNode.right; 
					
					if(currentNode==null) {
						parent.right = newNode;
						System.out.println("node added is " + parent.right.key);
						return;
					}
						
				}                                        
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		BST bst = new BST();
		
		bst.addNode(51, "Boss");
		
		bst.addNode(23, "employee");
		bst.addNode(67, "employee 2");
		bst.addNode(89, "employee");
		
		bst.addNode(4, "employee");
		bst.addNode(67, "employee");
		
		//bst.addNode(67, "employee");
		bst.addNode(34, "employee");
		
		
		
		//System.out.println(bst.toString());
				
		
	}
	
	
}

class Node{
	
	int key;
	
	String name;
	
	Node left;
	Node right;
	
	Node(int key,String name){
		
		this.key =key;
		this.name=name;
		left =	null;
		right = null;
		
	}
	
	
}
