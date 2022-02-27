import java.util.*;

class detectLoop {
    static class Node {
        int data;
        Node next;
        boolean flag;
    }

    static Node push(Node head_ref, int new_data){
        Node new_node = new Node();

        new_node.data = new_data;
        new_node.flag = false;

        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    static boolean detectLoop(Node h){
        while(h != null){
            if (h.flag) {
                return true;
            }

            h.flag = true;
            h = h.next;
        }
        return false;
    }

    public static void main(String[] args){
        Node head = null;

        head = push(head, 20);
        head = push(head, 4);
        head = push(head, 15);
        head = push(head, 10);

        head.next.next.next.next = head;

        if(detectLoop(head)){
            System.out.println("Loop has been found");
        } else {
            System.out.println("No loop found");
        }
    }
}
