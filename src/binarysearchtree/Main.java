package binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST1 = new BinarySearchTree();

        myBST1.insert(47);
        myBST1.insert(20);
        myBST1.insert(60);
        myBST1.insert(27);
        myBST1.insert(15);

        myBST1.insert(81);


        System.out.println("root = " + myBST1.root.left.right.value);
    }
}
