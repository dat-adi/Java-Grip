/*
 *
 * @name: G V Datta Adithya
 * @regno: 19BCE7119
 *
 */

// Importing the Scanner class for input
import java.util.Scanner;

// Creating a Node data structure
class Node{
    // Initializing variables inside the
    // Node
    int data;
    Node next;

    // Defining constructors
    Node(){}
    Node(int data){
        this.data = data;
    }
}

// Defining a single linked list
class SLL{
    // Defining the head and tail node
    static Node head = null, tail = null;

    // Defining a constructor for the class
    SLL(){}

    // Addition of a node to the linked list
    void addNode(int data){
        // Defining a temporary node
        // to act as the pointer
        Node tmp = new Node(data);

        // Adding the Node to the linked
        // list
        if(head == null){
            head = tail = tmp;
        } else {
            tail.next = tmp;
            tail = tail.next;
        }
    }

    // Defining a function to display the
    // data present in the linked list
    void displayNodes(){
        // Defining a temporary node
        Node tmp = head;

        // Iterating through the list
        while(tmp != null){
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    // Defining a method to rotate the elements
    // in a counter clockwise fashion
    void counterIt(int k, int n){
        // Defining a temporary node
        Node tmp = head;

        // Altering the shift to constraint
        // it within the linked list size
        k = k % n;

        // Iterating till the break point
        for(int i = 0; i < k - 1; i++){
            tmp = tmp.next;
        }

        // Defining node that serve as 
        // checkpoints for the method
        Node afterBreakNode = tmp.next;
        Node newHead = afterBreakNode;
        tmp.next = null;

        // Iterating till the end after breaking
        // the head node connection
        while(afterBreakNode.next != null){
            afterBreakNode = afterBreakNode.next;
        }

        // Re-establishing the head
        afterBreakNode.next = head;
        head = newHead;
    }
}

// Main class method
class CounterClockwiseLinkedList{
    public static void main(String[] args){
        // Defining a scanner object
        Scanner sc = new Scanner(System.in);
        SLL linkedlist = new SLL();

        // Enter the size of the linked list
        System.out.println("Enter the size of the linked list : ");
        int n = sc.nextInt();

        // Addition of elements into the linked list
        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + i + " : ");
            linkedlist.addNode(sc.nextInt());
        }
        System.out.println();

        // Displaying the altered linked list
        linkedlist.displayNodes();

        // Enter counter clockwise value
        System.out.println("Enter the k value : ");
        int k = sc.nextInt();

        // Calling the counter clockwise function
        linkedlist.counterIt(k, n);

        // Displaying the altered linked list
        linkedlist.displayNodes();
    }
}
