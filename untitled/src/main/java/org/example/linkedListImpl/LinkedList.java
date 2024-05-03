package org.example.linkedListImpl;

public class LinkedList {
    Node head; // head is the reference so by default is null

    public void insert(int data){
        Node node = new Node(); // create node
        node.data = data; // adding data
        node.next = null; // is obvious that is null by default -> you can omit it

        if(head == null){  // head have reference?
            head = node; //adding reference for 1st value
        }else{
            Node n = head; // reference
            while (n.next != null){ // node have next value?
                n = n.next; // yes, jump it
            }
            n.next = node; // no, add reference
        }

    }

    public void print(){

        Node node = head;  // put reference

        while (node.next != null){
            System.out.println(node.data); // all nodes that don't have next reference equals to null
            node = node.next;
        }
        System.out.println(node.data); // the last node (next reference is null)
    }

}
