public class SinglyLinkedList <E>{
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;

    public SinglyLinkedList() {

    }

    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public int size2()
    {
        int size2=0;
        Node<E> n=head;
        size2++;
        while(head.next!=null)
        {
            head=head.next;
            size2++;
        }
        return size2;
    }
    public E first()
    {
        if(isEmpty())return null;
        return head.element;
    }
    public E last()
    {
        if(isEmpty())return null;
        return tail.getElement();
    }
    public void addFirst(E newElement)
    {
        head=new Node<E>(newElement,head);
        if(isEmpty()) tail=head;
        size++;
    }
    public void addLast(E newElement)
    {
        Node<E> newest=new Node<E>(newElement,null);
        if(isEmpty()) head=newest;
        else  tail.setNext(newest);
        tail=newest;
        size++;
    }
    public E removeFirst()
    {
        if(isEmpty()) return null;
        E deleted=head.element;
        head=head.next;
        size--;
        if(isEmpty()) tail=null;
        return deleted;
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SinglyLinkedList l = (SinglyLinkedList) o;
        if (size != l.size) return false;
        Node Head = head; // traverse the primary list
        Node lHead = l.head; // traverse the secondary list
        while (Head != null) {
            if (!Head.getElement().equals(lHead.getElement())) return false;
            Head = Head.getNext();
            lHead = lHead.getNext();
        }
        return true;
    }

    public void findFromSecond()
    {
        while (head.next!=null)
        {
            System.out.println(head.next.element);
            head=head.next;
        }
    }
    public void rotate()
    {
        addLast(removeFirst());
    }

    public void concat(SinglyLinkedList list2)
    {
        tail.next= list2.head;
        size+=list2.size;
    }
    public void reverse()
    {
        if(head!=null)
        {
            Node<E> cn=head;
            Node<E> next;
            Node<E> pn=null;
            while (cn!=null)
            {
                next=cn.getNext();
                cn.setNext(pn);
                pn=cn;
                cn=next;
            }
            head=pn;
        }
    }

    private static class Node<E>{
        E element;
        Node<E> next;

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
