class Node {
  int data;
  Node left=null, right=null;

  Node(int data) {
    this.data = data;
  }

  boolean isLeaf() {
    return this.left == null && this.right == null;
  }
}

class BoundaryTraversal {
  public static void leftTraversal(Node root) {
    if(root == null){
      return;
    }

    Node node = root;

    while(!node.isLeaf()){
      System.out.print(node.data + " ");

      node = (node.left != null) ? node.left : node.right;
    }
  }

  public static void rightTraversal(Node root) {
    if(root == null){
      return;
    }

    Node node = root;

    while(!node.isLeaf()){
      System.out.print(node.data + " ");

      node = (node.right != null) ? node.right : node.left;
    }
  }

  public static void doTraversals(Node root) {
    System.out.println("Left Traversal : ");
    leftTraversal(root);
    System.out.println("Right Traversal : ");
    rightTraversal(root);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    root.left.left.left = new Node(8);
    root.left.left.right = new Node(9);
    root.left.right.left = new Node(10);
    root.left.right.right = new Node(11);

    doTraversals(root);
  }
}
