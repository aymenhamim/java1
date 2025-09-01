package doublylinkedlist;

public class Main {
    public static void main(String[] main){
        DoublyLinkedList DLL1 = new DoublyLinkedList(1);

        DLL1.append(2);
        DLL1.append(3);
        DLL1.prepend(0);

//        DLL1.prepend(-1);
//        DLL1.removeFirst();

//        System.out.println(DLL1.removeLast().value);
//        System.out.println(DLL1.get(5).value);
//        DLL1.set(0, -1);


        DLL1.getHead();
        DLL1.getTail();
        DLL1.getLength();


    }
}
