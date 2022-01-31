package com.greatlearning.service;
import java.util.ArrayList;

public class LongestPathClass {
	
	//Binary Tree node
	static class Node
	{
	    Node left;
	    Node right;
	    int data;
	};
	
	//New node
	static Node newNode(int data)
	{
	    Node temp = new Node();
	 
	    temp.data = data;
	    temp.left = null;
	    temp.right = null;
	 
	    return temp;
	}
	
	public static ArrayList<Integer> longestPath(Node root)
	{
		if(root == null)
		{
			ArrayList<Integer> longestPathArrayList = new ArrayList<>();
			return longestPathArrayList;
		}
		
		// Recursive call on right subtree
		ArrayList<Integer> right = longestPath(root.right);
		
		// Recursive call on left subtree
		ArrayList<Integer> left = longestPath(root.left);
		
		// Comparing and adding node 
		if(right.size() < left.size())
		{
			left.add(root.data);
		}
		else
		{
			right.add(root.data);
		}
		
		// Return the arrayList
		return (left.size() > right.size() ? left :right);
	}
	
	
	//Driver method
	public static void main(String args[]) {
		
		//Binary Tree creation
		Node root = newNode(100);
	    root.left = newNode(20);
	    root.right = newNode(130);
	    root.left.left = newNode(10);
	    root.left.left.left = newNode(5);
	    root.left.right = newNode(50);
	    root.right.left = newNode(110);
	    root.right.right = newNode(140);
	    
	    ArrayList<Integer> longestPathArrayList = longestPath(root);
		int n = longestPathArrayList.size();
		
		System.out.print(longestPathArrayList.get(n - 1));
		for(int i = n - 2; i >= 0; i--)
		{
			System.out.print(" -> " + longestPathArrayList.get(i));
		}
	}
}
