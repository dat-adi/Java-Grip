import java.util.HashMap;
import java.util.Map;
 
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
    // Traverse nodes in reverse preorder fashion
    public static void printRightView(Node root, int level, Map<Integer, Integer> map)
    {
        if (root == null) {
            return;
        }
 
        // insert the current node and level information into the map
        map.put(level, root.key);
 
        // recur for the left subtree before the right subtree
        printRightView(root.left, level + 1, map);
        printRightView(root.right, level + 1, map);
    }
 
    // Function to print the right view of a given binary tree
    public static void printRightView(Node root)
    {
        // create an empty map to store the last node for each level
        Map<Integer, Integer> map = new HashMap<>();
 
        // traverse the tree and fill the map
        printRightView(root, 1, map);
 
        // iterate through the map in sorted order of its keys and print the right view
        for (int i = 1; i <= map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
    }
 
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        printRightView(root);
    }
}