package com.test;

import java.util.Scanner;

public class BST {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	private static Node root = null;
	
	private static Scanner sc = new Scanner(System.in);
	
	private static Node insert(Node root, int data){
		if(root == null){
			return new Node(data);
		}
		else if(root.data > data) root.left = insert(root.left, data);
		else root.right = insert(root.right, data);
		return root;
	}
	
	private static boolean search(Node root, int key){
		if(root.data == key) return true;
		else if(root.data > key) search(root.left, key);
		else search(root.right, key);
		return false;
	}
	
	private static void preorder(Node root){
		if(root != null){
			System.out.print(" " + root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	private static void inorder(Node root){
		if(root != null){
			inorder(root.left);
			System.out.print(" " + root.data);
			inorder(root.right);
		}
	}
	
	private static void postorder(Node root){
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(" " + root.data);
		}
	}
	
	private static Node delete(Node root, int data){
		if(root == null){
			return null;
		}
		else if(root.data > data) delete(root.left, data);
		else if(root.data < data) delete(root.right, data);
		else{
			if(root.left == null){
				return root.right;
			}
			else if(root.right == null){
				return root.left;
			}
			else{
				root.data = max(root.left);
				root.left = delete(root.left, root.data);
			}
		}
		return root;
	}
	
	private static int max(Node root){
		if(root.right != null) root = root.right;
		return root.data;
	}
	
	public static void main(String[] args){
		while(true){
			System.out.println("Enter the option you wish to choose : ");
			System.out.println("1. Insert\n2. Search\n3. PreOrder\n4. InOrder\n5. PostOrder\n6. Delete\n7. Max");
			int choice = sc.nextInt();
			switch(choice){
				case 1:{
					System.out.println("Enter the data you wish to insert in the tree");
					insert(root, sc.nextInt());
					break;
				}
				case 2:{
					System.out.println("Enter the element you wish to search for :");
					if(search(root, sc.nextInt()))System.out.println("Element found");
					else
						System.out.println("Element not found");
					break;
				}
				case 3:{
					preorder(root);
					break;
				}
				case 4:{
					inorder(root);
					break;
				}
				case 5:{
					postorder(root);
					break;
				}
				case 6:{
					System.out.println("Enter the element to be deleted");
					delete(root, sc.nextInt());
					break;
				}
				case 7:{
					System.out.println("The max element in the tree is " + max(root));
					break;
				}
				default:{
					System.out.println("Invalid option, exiting....");
					System.exit(0);
					break;
				}
			}
		}
	}
}