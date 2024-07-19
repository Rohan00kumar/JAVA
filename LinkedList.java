// public class LinkedList {
//     Node head;
//     public class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // add node first
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     // add node last
//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         while (currNode.next != null) {
//             currNode = currNode.next;
//         }
//         currNode.next= newNode;
//     }
//     // print the list 
//     public void printList() {
//         if (head == null) {
//             System.out.println("list is empty");
//         }
//         Node currNode = head;
//         while (currNode != null) {
//             System.out.print(currNode.data + " " + "->" + " ");
//             currNode = currNode.next;
//         }
//         System.out.println("null");
//     }

//     // delete first node
//     public void delFirst() {
//         if (head == null) {
//             System.out.println("list is empty");
//         }
//         head = head.next;
//     }
    
//     public void delLast() {
//         if (head == null) {
//             System.out.println("list is empty");
//         }

//         if (head.next == null) {
//             head = null;
//             return;
//         }

//         Node secLast = head;
//         Node lastNode = head.next;
//         while (lastNode.next != null) {
//             lastNode = lastNode.next;
//             secLast = secLast.next;
//         }
//         secLast.next = null;
//     }
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();

//         list.addFirst(20);
//         list.addFirst(30);
//         list.addFirst(40);
//         list.addLast(50);
//         list.printList();

//         // list.delFirst();
//         list.delLast();
//         list.printList();
//     }
// }
