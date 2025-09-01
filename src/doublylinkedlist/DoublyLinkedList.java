package doublylinkedlist;

import org.w3c.dom.Node;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public class Node{
        int value;
        Node next;
        Node previous;

        public Node(int value){
            this.value = value;
        }
    }

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead(){System.out.println("Head: " + head.value + "\n");}
    public void getTail(){System.out.println("Tail: " + head.value + "\n");}
    public void getLength(){System.out.println("Length: " + length + "\n");}

}
