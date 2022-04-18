import java.util.*;

class Node {
  int key;
  Node left=null, right=null;

  Node(int key) {
    this.key = key;
  }
}

class VerticalOrderTraversal {
  public static void insertIntoMultiMap(Map<Integer, List<Integer>> map, Integer key, Integer value) {
    map.putIfAbsent(key, new ArrayList<>());
    map.get(key).add(value);
  }

  public static void printVertical(Node root, int dist, Map<Integer, List<Integer>> map) {
    if(root == null) {
      return;
    }

    insertIntoMultiMap(map, dist, root.key);
    printVertical(root.left, dist - 1, map);
    printVertical(root.right, dist + 1, map);
  }

  public static void printVertical(Node root) {
    Map<Integer, List<Integer>> map = new TreeMap<>();

    printVertical(root, 0, map);
    for(Collection<Integer> collection: map.values()) {
      System.out.println(collection);
    }
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    printVertical(root);
  }
}
