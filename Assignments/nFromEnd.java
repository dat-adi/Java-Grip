class nFromEnd{
    class LinkedList{
        LinkedList(){
            this.data = null;
            this.next = null;
        }

        LinkedList(int data){
            this.data = data;
        }

        void addNode(int val){
            this.next = LinkedList(val);
        }
    }
    public static void main(String[] args){

    }
}
