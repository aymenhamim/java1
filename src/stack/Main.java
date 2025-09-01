package stack;

public class Main {
    public static void main(String[] args){
        Stack Stack1 = new Stack(3);

        Stack1.push(2);
        Stack1.push(1);
        Stack1.push(0);

        Stack1.pop();

        Stack1.getTop();
        Stack1.getHeight();

        Stack1.printStack();
    }
}
