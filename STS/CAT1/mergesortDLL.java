class Node
{
    int data;
    Node next, prev;
 
    Node(int data) {
        this.data = data;
    }
}
 
class EthCode
{
    // Utility function to push a node at the beginning of the doubly linked list
    public static Node push(Node head, int key)
    {
        Node node = new Node(key);
        node.next = head;
 
        // change `prev` of the existing head node to point to the new node
        if (head != null) {
            head.prev = node;
        }
 
        // return new head node
        return node;
    }
 
    public static void printDDL(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ⇔ ");
            head = head.next;
        }
 
        System.out.println("null");
    }
 
    // Function to split nodes of the given doubly linked list into two halves using the fast/slow pointer strategy
    public static Node split(Node head)
    {
        Node slow = head;
        Node fast = head.next;
 
        // advance `fast` by two nodes, and advance `slow` by a single node
        while (fast != null)
        {
            fast = fast.next;
            if (fast != null)
            {
                slow = slow.next;
                fast = fast.next;
            }
        }
 
        return slow;
    }
 
    // Recursive function to merge nodes of two sorted lists into a single sorted list
    public static Node merge(Node a, Node b)
    {
        // base cases
        if (a == null) {
            return b;
        }
 
        if (b == null) {
            return a;
        }
 
        // pick either `a` or `b`, and recur
        if (a.data <= b.data)
        {
            a.next = merge(a.next, b);
            a.next.prev = a;
            a.prev = null;
            return a;
        }
        else {
            b.next = merge(a, b.next);
            b.next.prev = b;
            b.prev = null;
            return b;
        }
    }
 
    // Function to sort a doubly-linked list using merge sort algorithm
    public static Node mergesort(Node head)
    {
        // base case: 0 or 1 node
        if (head == null || head.next == null) {
            return head;
        }
 
        // split head into `a` and `b` sublists
        Node a = head, b;
 
        Node slow = split(head);
        b = slow.next;
        slow.next = null;
 
        // recursively sort the sublists
        a = mergesort(a);
        b = mergesort(b);
 
        // merge the two sorted lists
        head = merge(a, b);
        return head;
    }
 
    public static void main(String[] args)
    {
        int[] keys = { 6, 4, 8, 7, 9, 2, 1 };
 
        Node head = null;
        for (int key: keys) {
            head = push(head, key);
        }
 
        head = mergesort(head);
        printDDL(head);
    }
}