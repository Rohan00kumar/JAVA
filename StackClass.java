// import java.util.ArrayList;

import java.util.*;;

public class StackClass {
    // ------ Linked list -----
    // static class Node {
    // int data;
    // Node next;

    // public Node(int data){
    // this.data = data;
    // next = null;
    // }
    // }

    // static class Stack {
    // public static Node head;

    // public static boolean isEmpty() {
    // return head == null;
    // }

    // public static void push(int data) {
    // Node newNode = new Node(data);
    // if (isEmpty()) {
    // head = newNode;
    // return;
    // }

    // newNode.next = head;
    // head = newNode;
    // }

    // public static int pop() {
    // if (isEmpty()) {
    // return -1;
    // }
    // int top = head.data;
    // head = head.next;
    // return top;
    // }

    // public static int peek() {
    // if (isEmpty()) {
    // return -1;
    // }
    // return head.data;
    // }

    // }

    // ------- ArrayList -----
    // static class Stack {
    //     static ArrayList<Integer> list = new ArrayList<>();

    //     public static boolean isEmpty() {
    //         return list.size() == 0;
    //     }

    //     // push
    //     public static void push(int data) {
    //         list.add(data);
    //     }

    //     // pop
    //     public static int pop() {
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         int top = list.get(list.size() - 1);
    //         list.remove(list.size() - 1);
    //         return top;
    //     }

    //     // peek
    //     public static int peek() {
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         return list.get(list.size() - 1);
    //     }
    // }

    public static void main(String[] args) {

        // ---- Linked List and Arraylist ----
        // Stack s = new Stack();
        // s.push(12);
        // s.push(11);
        // s.push(13);

        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        // --- Collection Framework ---

        Stack<Integer> s = new Stack<>();

        s.push(23);
        s.push(24);
        s.push(25);
        s.push(27);

        while (!s.isEmpty()) {
        System.out.println(s.peek());
        s.pop();
        }

    }
}
