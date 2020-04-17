package com.test;

import java.util.Scanner;

public class ExpressionTree {
	static class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	private static Scanner sc = new Scanner(System.in);
	
	private Node root;
	
	private ExpressionTree(){
		root = null;
	}
	
	private static Node insertion(int[] arr, Node root, int i){
		if(i < arr.length){
			root = new Node(arr[i]);
			root.left = insertion(arr, root.left, 2*i + 1);
			root.right = insertion(arr, root.right, 2*i + 2);
		}
		return root;
	}
	
	private static void inOrder(Node root){
		if(root != null){
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	private static void preOrder(Node root){
		if(root != null){
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	private static void postOrder(Node root){
		if(root != null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	public static void main(String[] args){
		ExpressionTree tree = new ExpressionTree();
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		tree.root = insertion(arr, tree.root, 0);
		preOrder(tree.root);
		System.out.println();
		inOrder(tree.root);
		System.out.println();
		postOrder(tree.root);
	}
}
