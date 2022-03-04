// Importing the Scanner class for input
import java.util.Scanner;

// Creating a Node data structure
class Node{
    // Initializing variables inside the Node
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
    Node head = null, tail = null;

    // Defining a constructor for the class
    SLL(){}

    // Addition of a node to the linked list
    void addNode(int data){
        // Defining a temporary node
        // to act as the pointer
        Node tmp = new Node(data);

        // Adding the Node to the linked
        // list
        if(this.head == null){
            this.head = this.tail = tmp;
        } else {
            this.tail.next = tmp;
            this.tail = this.tail.next;
        }
    }

    void insertZeroNode(){
        Node tmp = new Node(0);
        tmp.next = this.head;
        head = tmp;
    }

    // Getting the value of the node given
    int getNode(int index){
        Node tmp = this.head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    // Defining a function to display the
    // data present in the linked list
    void displayNodes(){
        // Defining a temporary node
        Node tmp = this.head;

        // Iterating through the list
        while(tmp != null){
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}

class PartitionList {
    public static Node partition(Node head, int x) {
        /* Let us initialize first and last nodes of
        three linked lists
            1) Linked list of values smaller than x.
            2) Linked list of values equal to x.
            3) Linked list of values greater than x.*/
        Node smallerHead = null, smallerLast = null;
        Node greaterLast = null, greaterHead = null;
        Node equalHead = null, equalLast =null;
     
        // Now iterate original list and connect nodes
        // of appropriate linked lists.
        while (head != null)
        {
            // If current node is equal to x, append it
            // to the list of x values
            if (head.data == x)
            {
                if (equalHead == null)
                    equalHead = equalLast = head;
                else
                {
                    equalLast.next = head;
                    equalLast = equalLast.next;
                }
            }
     
            // If current node is less than X, append
            // it to the list of smaller values
            else if (head.data < x)
            {
                if (smallerHead == null)
                    smallerLast = smallerHead = head;
                else
                {
                    smallerLast.next = head;
                    smallerLast = head;
                }
            }
            else // Append to the list of greater values
            {
                if (greaterHead == null)
                    greaterLast = greaterHead = head;
                else
                {
                    greaterLast.next = head;
                    greaterLast = head;
                }
            }
            head = head.next;
        }
     
        // Fix end of greater linked list to NULL if this
        // list has some nodes
        if (greaterLast != null)
            greaterLast.next = null;
     
        // Connect three lists
     
        // If smaller list is empty
        if (smallerHead == null)
        {
            if (equalHead == null)
                return greaterHead;
            equalLast.next = greaterHead;
            return equalHead;
        }
     
        // If smaller list is not empty
        // and equal list is empty
        if (equalHead == null)
        {
            smallerLast.next = greaterHead;
            return smallerHead;
        }
     
        // If both smaller and equal list
        // are non-empty
        smallerLast.next = equalHead;
        equalLast.next = greaterHead;
        return smallerHead;
    }

    public static void main(String[] args){
        // Taking inputs using the scanner object
        Scanner sc = new Scanner(System.in);
        SLL linklist = new SLL();

        System.out.println("Size of linked list : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            linklist.addNode(sc.nextInt());
        }

        // Displaying the initial list
        System.out.print("Initial Linked List : ");
        linklist.displayNodes();

        // Partitioning
        System.out.println("From which index position?");
        linklist.head = partition(linklist.head, sc.nextInt());
        linklist.displayNodes();
    }
}
