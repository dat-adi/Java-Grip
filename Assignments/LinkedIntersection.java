// Importing the Scanner class for input
import java.util.Scanner;
import java.util.Random;

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
    Node head = null;
    Node tail = null;

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
            this.head = this.tail = tmp;
        } else {
            this.tail.next = tmp;
            this.tail = this.tail.next;
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

    void connectTail(SLL linkedList, int intersection){
        Node tmp = linkedList.head;
        for(int i = 0; i < intersection; i++){
            tmp = tmp.next;
        }

        this.tail.next = tmp;
    }
}

class LinkedIntersection{
    private static int findRandomIntersectionPoint(int n1, int n2){
        return (n1 > n2) ? n1 : (n1 == n2) ? n1 : n2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        SLL ll1 = new SLL();
        SLL ll2 = new SLL();

        System.out.println("Enter size of the first linked list : ");
        int n1 = sc.nextInt();

        for(int i = 0; i < n1; i++){
            ll1.addNode(i);
        }

        System.out.println("Enter size of the second linked list : ");
        int n2 = sc.nextInt();

        for(int i = 0; i < n2; i++){
            ll2.addNode(i);
        }

        int frip = rand.nextInt(findRandomIntersectionPoint(n1, n2));
        ll1.getTail(ll2, frip);
    }
}
