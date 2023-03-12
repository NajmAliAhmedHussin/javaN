public class ArrayQueue<E> implements Queue<E>{
    private int s=0;
    private int f=0;
    E []data;
    static final int CAPACITY=10;
    public ArrayQueue(int c)
    {
        data=(E[])new Object[c];
    }
    public ArrayQueue()
    {
        this(CAPACITY);
    }
    @Override
    public boolean isEmpty() {
        return s==0;
    }

    @Override
    public int size() {
        return s;
    }

    @Override
    public E first() {
        if(isEmpty()) return null;
        return data[f];
    }

    @Override
    public void enqueue(E e) {
        int x;
        if(s==data.length)
            throw new IllegalStateException("Array is Full");
        else
            x=(f+s)%data.length;
        data[x]=e;
        s++;

    }

    @Override
    public E dequeue() {
        if(isEmpty()) return null;
        E x=data[f];
        data[f]=null;
        f=(f+1)% data.length;
        s--;
        return x;
    }

    public E rotate()
    {
        E x=data[f];
        f=(f+1)% data.length;
        return x;
    }
}
