class Views {
  static class Node {
    int key;
    Node left=null, right=null;

    Node(int key) {
      this.key = key;
    }
  }

  private static int printLeft(Node root, int level, int previous_level) {
    if (root == null) {
      return previous_level;
    }

    if (previous_level < level) {
      System.out.print(root.key + " ");
      previous_level = level;
    }

    previous_level = printLeft(root.left, level+1, previous_level);
    previous_level = printLeft(root.right, level+1, previous_level);

    return previous_level;
  }

  private static int printRight(Node root, int level, int previous_level) {
    if (root == null) {
      return previous_level;
    }

    if (previous_level < level) {
      System.out.print(root.key + " ");
      previous_level = level;
    }

    previous_level = printRight(root.right, level+1, previous_level);
    previous_level = printRight(root.left, level+1, previous_level);

    return previous_level;
  }

  private static void views(Node root) {
    System.out.println("Left View : ");
    printLeft(root, 1, 0);
    System.out.println("\nRight View : ");
    printRight(root, 1, 0);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    views(root);
  }
}
