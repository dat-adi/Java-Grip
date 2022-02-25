/*
 * Given two linked lists, each list node with one integer digit, add these two linked lists.
 * The result should be stored in the third linked list.
 *
 * Note that the head node contains the most significant digit of the number.
 * Also note that given linked lists may vary in size.
 *
 * @name: G V Datta Adithya
 * @regno: 19BCE7119
 *
 */
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

    void setCarries(){
        Node tmp = this.head;
        Node tmpHead = this.head.next;
        int carry;

        while(tmpHead != null){
            if(tmpHead.data > 9){
                carry = tmpHead.data / 10;
                tmpHead.data = tmpHead.data % 10;
                tmp.data++;
            }
            tmp = tmp.next;
            tmpHead = tmpHead.next;
        }
    }
}

class signiList {
    private static SLL addLinkedLists(SLL l1, SLL l2, int n1, int n2){
        // Conditions => if l1.size >/</= l2.size
        SLL l3 = new SLL();

        if(n1 == n2){
            for(int i = 0; i < n1; i++){
                l3.addNode(l1.getNode(i) + l2.getNode(i));
            }
        } else if (n1 > n2){
            int diff = n1 - n2;
            int i;

            for(i = 0; i < diff; i++){
                l3.addNode(l1.getNode(i));
            }

            for(int j = 0; j < n2; j++){
                l3.addNode(l1.getNode(i) + l2.getNode(j));
                i++;
            }
        } else {
            int diff = n2 - n1;
            int i;

            for(i = 0; i < diff; i++){
                l3.addNode(l2.getNode(i));
            }

            for(int j = 0; j < n1; j++){
                l3.addNode(l1.getNode(j) + l2.getNode(i));
                i++;
            }
        }

        l3.insertZeroNode();

        return l3;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SLL l1 = new SLL();
        SLL l2 = new SLL();

        System.out.println("Enter the size of the first linked list : ");
        int n1 = sc.nextInt();

        System.out.println("Enter the size of the second linked list : ");
        int n2 = sc.nextInt();

        for(int i = 0; i < n1; i++){
            System.out.print(
                    "Enter the " 
                    + (i+1) + 
                    "th element of the first linked list : ");
            l1.addNode(sc.nextInt());
        }

        for(int i = 0; i < n2; i++){
            System.out.print(
                    "Enter the " 
                    + (i+1) 
                    + "th element of the second linked list : ");
            l2.addNode(sc.nextInt());
        }

        System.out.println("First Linked List ");
        l1.displayNodes();

        System.out.println("Second Linked List ");
        l2.displayNodes();

        SLL l3 = addLinkedLists(l1, l2, n1, n2);
        l3.setCarries();

        System.out.println("Here is the resultant of the addition");
        l3.displayNodes();
    }
}
