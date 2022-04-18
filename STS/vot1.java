import java.util.*;
 
// A class to store a binary tree node
class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int key) {
        this.key = key;
    }
}
 
class Main
{
    // Utility function to add an element to the list corresponding to the given
    // key in `Map<Integer, List<Integer>>`.
    public static void insertIntoMultiMap(Map<Integer, List<Integer>> map,
                                        Integer key, Integer value) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(value);
    }
 
    // Recursive function to perform preorder traversal on the tree and fill the map.
    // Here, the node has `dist` horizontal distance from the tree's root
    public static void printVertical(Node node, int dist,
                                    Map<Integer, List<Integer>> map)
    {
        // base case: empty tree
        if (node == null) {
            return;
        }
 
        // insert nodes present at a current horizontal distance into the map
        insertIntoMultiMap(map, dist, node.key);
 
        // recur for the left subtree by decreasing horizontal distance by 1
        printVertical(node.left, dist - 1, map);
 
        // recur for the right subtree by increasing horizontal distance by 1
        printVertical(node.right, dist + 1, map);
    }
 
    // Function to perform vertical traversal on a given binary tree
    public static void printVertical(Node root)
    {
        // create an empty `TreeMap` where
        // key —> relative horizontal distance of the node from the root node, and
        // value —> nodes present at the same horizontal distance
        Map<Integer, List<Integer>> map = new TreeMap<>();
 
        // perform preorder traversal on the tree and fill the map
        printVertical(root, 0, map);
 
        // traverse the `TreeMap` and print vertical nodes
        for (Collection<Integer> collection: map.values()) {
            System.out.println(collection);
        }
    }
 
    public static void main(String[] args)
    {

 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        root.right.left.right.left = new Node(9);
        root.right.left.right.right = new Node(10);
 
        printVertical(root);
    }
}