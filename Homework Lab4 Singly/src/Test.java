import java.io.Serializable;

public class Test {
    public static void main(String[] args) {
        SinglyLinkedList<Character> L=new SinglyLinkedList<>();
        System.out.println(L.size());

        L.addFirst('A');
        L.addLast('B');
        L.addLast('C');
        L.addFirst('E');
        System.out.println("  ");
        SinglyLinkedList<Character> L2=new SinglyLinkedList<>();
        L2.addFirst('F');
        L2.addLast('G');
        L2.addLast('H');
        L2.addFirst('I');
        System.out.println(L.Last());

        L.list2(L2);
        System.out.println(L.size());
        while (!L.isEmpty())
        {
            System.out.print(L.removeFirst()+" ");

    }
}}
