package LeetCode;

import java.util.*;

class EleLinked {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static Node head = null;
    private static Node tail = null;

    private static final Scanner sc = new Scanner(System.in);

    private static void create_link(int size){
        for(int i = 0; i < size; i++){
            Node temp = new Node(sc.nextInt());
            if(head == null)head = tail = temp;
            else{
                tail.next = temp;
                tail = temp;
            }
        }
    }

    private static void show_link(){
        tail = head;
        while(tail != null){
            System.out.println(tail.data);
            tail = tail.next;
        }
    }

    public static void main(String[] args){
        int size = sc.nextInt();
        create_link(size);
        show_link();
        sc.close();
    }
}