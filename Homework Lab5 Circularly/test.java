public class test {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> Cl=new CircularlyLinkedList<>();
        System.out.println(Cl.isEmpty());
        Cl.AddFirst(1);
        Cl.AddLast(2);
        Cl.AddLast(3);
        Cl.AddLast(4);
        CircularlyLinkedList<Integer> Cl2=new CircularlyLinkedList<>();
        Cl2.AddFirst(1);
        Cl2.AddLast(2);
        Cl2.AddLast(6);
        Cl2.AddLast(4);


        System.out.println(Cl.lik(Cl2));
        System.out.println(Cl.equals(Cl2));
        System.out.println(Cl.SizeFuntaion());
    }
}
