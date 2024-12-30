package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        
        public void addFirst(int data){ //Time Complexity - O(1)
            //step 1 - create a new node
            Node newNode = new Node(data);
            if(head == null){//in case of empty linkedlist
                head = tail = newNode;
                return;
            }

            //step 2 - newNode next = head
            newNode.next = head;

            //step 3 - head = newNode
            head = newNode;
        }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
