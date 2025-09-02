package HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable myHT = new HashTable();

        myHT.set("age", 21);
        myHT.set("nails", 100);
        myHT.set("tile", 80);

        myHT.set("bolts", 150);
        System.out.println(myHT.get("bolts"));

        myHT.printTable();
    }
}
