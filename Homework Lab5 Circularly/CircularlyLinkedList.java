public class CircularlyLinkedList<E> {

    private Node<E> tail=null;
    private int size;

    public CircularlyLinkedList() {  }

    public int size(){return size; }
    public boolean isEmpty(){return size==0; }
    public E first(){
        if (isEmpty())return null;
        return tail.getNext().getElement();
    }

    public E last(){
        if (isEmpty())return null;
        return tail.getElement();
    }

    public void AddFirst(E element){
        if (size==0){
          tail=new Node<>(element,null);
          tail.setNext(tail);
        }
        else {
            Node<E> newest = new Node<>(element, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }
    public void AddLast(E e){
        AddFirst(e);
        tail=tail.next;

    }
    public E removeFirst()
    {
        if(isEmpty()) return null;
        Node<E> deleted=tail.next;
        if (deleted==tail)tail=null;
        else
            tail.next=deleted.next;
        size--;
        return deleted.element;
    }
    public void rotate(){
        if (tail!=null)
            tail=tail.getNext();
    }
    public int SizeFuntaion()
    {
        int size=0;
        Node<E> x=tail;
        while (tail.next!=x)
        {
            size++;
            tail=tail.next;
        }
        size++;
        return size;
    }
    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        CircularlyLinkedList l = (CircularlyLinkedList) o;
        if (size != l.size) return false;
        Node x=tail.next;
        Node Head = tail.next;
        Node lHead = l.tail.next;
        while (Head.next !=x) {
            if (!Head.getElement().equals(lHead.getElement())) return false;
            Head = Head.getNext();
            lHead = lHead.getNext();
        }
        return true;
    }

    public boolean lik(CircularlyLinkedList list)
    {
        Node<E> x;
        Node<E> x2;
        int count=0;
        if (list.size>size)
        {
            x=list.tail.next;
            x2= tail.next;
        }
        else
        {
            x=tail.next;
            x2= list.tail.next;
        }
        while(x.element != x2.element)
        {
            x2=x2.next;
        }
        //for (int i = 0;p1.element==p2.element ; i++)
        if (x.element==x2.element){
            count++;
        }
        if (count>1) return true;
        return false;
    }

    private static class Node<E>{
        private E element;
        private Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
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
    }
}
