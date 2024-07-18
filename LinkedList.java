public class LinkedList {
    Node head;
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add node first
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add node last

    public void addLast(int data) {
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
        head.next = currNode;
    }
    // print the list 
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(20);
        list.addFirst(30);
        list.printList();
    }
}
