import java.util.*;
class rightView{
  static class Node {
    int key;
    Node left;
    Node right;
  };

  static Node root = null;
  static Queue<Node> q = new LinkedList<>();
  static Node newNode(int value) {
    Node n = new Node();
    n.key = value;
    n.left = null;
    n.right = null;
    return n;
  }

  static void insertValue(int value) {
    Node node = newNode(value);
    if(root == null) {
      root = node;
    } else if (q.peek().left == null) {
      q.peek().left = node;
    } else {
      q.peek().right = node;
      q.remove();
    }
    q.add(node);
  }

  static void createTree(int[] arr, int n) {
    for(int i =  0; i < n; i++) {
      insertValue(arr[i]);
    }
  }

  public static void rightView(Node root) {
    Map<Integer, Integer> map = new HashMap<>();
    rightView(root, 1, map);
    for(int i = 1; i <= map.size(); i++) {
      System.out.print(map.get(i) + " ");
    }
  }

  private static void rightView(Node root, int i, Map<Integer, Integer> map) {
    if(root == null) {
      return;
    }
    map.putIfAbsent(i, root.key);
    rightView(root.right, i+1, map);
    rightView(root.left, i+1, map);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    createTree(arr, n);
    rightView(root);
  }
}
