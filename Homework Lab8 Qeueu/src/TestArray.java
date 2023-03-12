public class TestArray {
    public static void main(String[] args) {

        ArrayQueue<Integer> q=new ArrayQueue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        for (int i = 0; i < q.size(); i++) {
            System.out.println(q.rotate());
        }
        System.out.println(q.size());
        System.out.println(q.size());
        ListQueue<Integer> l=new ListQueue<>();
        l.enqueue(1);
        l.enqueue(2);
        ListQueue<Integer> l2=new ListQueue<>();
        l2.enqueue(3);
        l2.enqueue(4);
        l.concat(l2);
        while (!l.isEmpty()) System.out.println(l.dequeue());



    }

}
