package Trees;

import java.util.Scanner;

class BinaryTree {
	
	static class Node{
		int key;
		Node left, right;
		Node(int data){
			this.key = data;
			this.left = null;
			this.right = null;
		}
	}
	
	
	private static Scanner sc = new Scanner(System.in);
	private Node root;
	
	private BinaryTree(){
		root = null;
	}
	
	private static Node insertLevelOrder(int[] arr, Node root, int i){
		if(i < arr.length){
			root = new Node(arr[i]);
			root.left = insertLevelOrder(arr, root.left, 2*i + 1);
			root.right = insertLevelOrder(arr, root.right, 2*i + 2);
		}
		return root;
	}
	
	private static void inOrder(Node root){
		if(root != null){
			inOrder(root.left);
			System.out.print(root.key + " ");
			inOrder(root.right);
		}
	}
	
	private static void preOrder(Node root){
		if(root != null){
			System.out.print(root.key + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	private static void postOrder(Node root){
		if(root != null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.key + " ");
		}
	}
	
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array : ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		tree.root = insertLevelOrder(arr, tree.root, 0);
		preOrder(tree.root);
		System.out.println();
		inOrder(tree.root);
		System.out.println();
		postOrder(tree.root);
		System.out.println();
	}
}
