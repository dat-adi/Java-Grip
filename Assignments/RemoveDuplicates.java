// Importing the Scanner class for input
import java.util.Scanner;
import java.util.HashSet;

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

    // Getting the dataue of the node given
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
    // Function to remove duplicates from a 
    // unsorted linked list
    void removeDuplicate()  { 
        // Hash to store seen dataues 
        HashSet<Integer> hs = new HashSet<>(); 
      
        /* Pick elements one by one */
        Node current = this.head; 
        Node prev = null; 
        while (current != null)  
        { 
            int curdata = current.data; 
              
             // If current dataue is seen before 
            if (hs.contains(curdata)) { 
                prev.next = current.next; 
            } else { 
                hs.add(curdata); 
                prev = current; 
            } 
            current = current.next; 
        } 
  
    } 
}

class RemoveDupicates{
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

        // Final Linked List
        System.out.print("Final Linked List : ");
        linklist.removeDuplicate();
        linklist.displayNodes();
    }
}
