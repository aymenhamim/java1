package doublylinkedlist;

public class Main {
    public static void main(String[] main){
        DoublyLinkedList LL1 = new DoublyLinkedList(1);

        LL1.append(2);
        LL1.append(3);
        LL1.prepend(0);

//        System.out.println(LL1.removeLast().value);

        LL1.getHead();
        LL1.getTail();
        LL1.getLength();

    }
}
