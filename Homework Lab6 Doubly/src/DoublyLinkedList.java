public class DoublyLinkedList<E> {

    private int size=0;
    private Node<E> header;
    private Node<E> trailer;

    public DoublyLinkedList() {
        header=new Node<>(null,null,null);
        trailer=new Node<>(null,null,header);
        header.next=trailer;
    }

    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public E first()
    {
        if (isEmpty())return null;
        return header.next.element;
    }
    public E last()
    {
        if (isEmpty())return null;
        return trailer.prev.element;
    }

    private void addBetween(E e,Node<E> next, Node<E> prev)
    {
        Node<E> newest = new Node<>(e,next,prev);
        prev.next=newest;
        next.prev=newest;
        size++;
    }
    public void addFirst(E e)
    {
        addBetween(e,header.next,header);
    }
    public void addLast(E e)
    {
        addBetween(e,trailer,trailer.prev);
    }
    private E remove(Node<E> x)
    {
        Node<E> p=x.prev;
        Node<E> n=x.next;
        p.next=n;
        n.prev=p;
        size--;
        return x.element;
    }
    public E removeFirst()
    {
        return remove(header.next);
    }
    public E removeLast()
    {
        return remove(trailer.prev);
    }

    public E middle()
    {
        Node<E> p=header.next;
        Node<E> mid=p;
        int c=0;
        while (p!=trailer)
        {
            c++;
            p=p.next;
        }
        int div=c/2;
        if ((div)%2==0)mid=mid.prev;
        for (int i = 1; i <=div ; i++) {
            mid=mid.next;
        }
        return mid.element;
    }

    public void to(DoublyLinkedList<E> list)
    {
        Node<E> t=trailer.prev;
        Node<E> h=list.header.next;
        t.next=h;
        h.prev=t;
        trailer.prev=null;
        list.header.next=null;
        size+= list.size;

    }
    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        DoublyLinkedList l = (DoublyLinkedList) o;
        if (size != l.size) return false;
        Node Head = header;
        Node lHead = l.header;
        while (Head != null) {
            if (!Head.getElement().equals(lHead.getElement())) return false;
            Head = Head.getNext();
            lHead = lHead.getNext();
        }
        return true;
    }


    public int size2()
    {
        int size2=0;
        Node<E> n=header;
        size2++;
        while(header.next!=null)
        {
            header=header.next;
            size2++;
        }
        return size2;
    }

    private class Node<E>{
        private E element;
        Node<E> prev;
        Node<E> next;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}
