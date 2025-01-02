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
        public static int size;
        
        public void addFirst(int data){ //Time Complexity - O(1)
            //step 1 - create a new node
            Node newNode = new Node(data);
            size++;
            if(head == null){//in case of empty linkedlist
                head = tail = newNode;
                return;
            }

            //step 2 - newNode next = head
            newNode.next = head;

            //step 3 - head = newNode
            head = newNode;
        }
        public void addLast(int data){
            //step 1 - create a new node
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }

            //step 2 - tail.next = newNode
            tail.next = newNode;

            //step 3 - tail = newNode
            tail = newNode;
        }

        //adding in the middle of the linkedlist
        public void add(int idx, int data){
            if(idx == 0){
                addFirst(data);
                return;
            }

            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;
            while(i < idx-1){
                temp = temp.next;
                i++;
            }

            //i = idx-1; temp -> prev
            newNode.next = temp.next;
            temp.next = newNode;
        }
        public int removeFirst(){
            if(size == 0){
                System.out.println("Empty Linkedlist");
                return Integer.MIN_VALUE;
            } else if(size == 1){
                int value = head.data;
                head = tail = null;
                size--;
                return value;
            }
            int value = head.data;
            head = head.next;
            size--;
            return value;
        }
        public int removeLast(){
            if(size == 0){
                System.out.println("Empty Linkedlist");
            }else if(size == 1){
                int value = tail.data;
                head = tail = null;
                size--;
                return value;
            }
            int value = tail.data;
            Node temp = head;
            while(temp.next != tail){//traverse to second to last node
                temp = temp.next;
            }
            temp.next = null; //disconnect the last node
            tail = temp; //update the tail pointer
            size--;   //decrement size of linkedlist
            return value; //return the removed value
        }

        //Iterative Search - return index if key/element found
        public int itrSearch(int key){
            Node temp = head;
            int idx = 0;
            while(temp != null){
                if(temp.data == key){ //key found
                    return idx;
                }
                temp = temp.next;
                idx++;
            }
            //key not found
            return -1;
        }
        public void printLinkedList(){
            if(head == null){
                System.out.println("LinkedList is empty");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(7);
        ll.addLast(8);
        ll.printLinkedList();
        System.out.println("Size of LinkedList is : "+size);
        ll.add(0, 9);
        ll.add(3, 3); //add at specific index
        ll.printLinkedList();
        System.out.println("Size of LinkedList is : "+size);

        System.out.println("first deleted node data is : "+ll.removeFirst());
        ll.printLinkedList();  

        System.out.println("last deleted node data is : "+ll.removeLast());
        ll.printLinkedList();

        System.out.println("key found at index : "+ll.itrSearch(6));
    }
}