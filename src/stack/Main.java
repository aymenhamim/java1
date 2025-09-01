package stack;

public class Main {
    public static void main(String[] args){
        Stack Stack1 = new Stack(5);

        Stack1.push(4);
        Stack1.push(3);

        Stack1.getTop();
        Stack1.getHeight();

        Stack1.printStack();
    }
}
