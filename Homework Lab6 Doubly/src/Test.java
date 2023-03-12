public class Test {
    public static void main(String[] args) {
        DoublyLinkedList<String> Doubly=new DoublyLinkedList<>();

        Doubly.addLast("Ahmed");
        Doubly.addLast("Ali");
        Doubly.addLast("Najm");

        while (!Doubly.isEmpty())
        {
            System.out.print(Doubly.removeLast()+" ");

        }
    }

}
