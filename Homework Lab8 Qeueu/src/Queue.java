public interface Queue<E> {
    boolean isEmpty();
    int size();
    E first();
    void enqueue(E e);
    E dequeue();
}
