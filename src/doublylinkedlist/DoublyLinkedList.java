package doublylinkedlist;

import org.w3c.dom.Node;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public class Node{
        int value;
        Node next;
        Node prev;

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
    public void getTail(){System.out.println("Tail: " + tail.value + "\n");}
    public void getLength(){System.out.println("Length: " + length + "\n");}

    public void append(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        length ++;
    }
    public Node removeLast(){
        if(length == 0) return null;
        Node temp = tail;

        if(length == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;

        return temp;
    }

}
