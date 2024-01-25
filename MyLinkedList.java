public class MyLinkedList<E> {
    private int size = 0;
    private Node tail;
    private Node head;

    private class Node<E> {
        E value;
        Node next;
        Node prev;

        public Node(E value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void add(E obj) {
        if(size == 0) {
            head = new Node(obj, null, null);
            tail = head;
        }
        else {
            Node temp = new Node(obj, null,tail);
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public E get(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of Bounds");
        }
        int counter = 0;
        Node cur = head;
        while(cur != null) {
            if(counter == index) {
                return (E)cur.value;
            }
            cur = cur.next;
            counter++;
        }
        return null;
    }

    public void swap(int ind1, int ind2) {
        if (ind1 < 0 || ind 2 < 0 || ind1 >= size || ind2 >= size) {
            throw new IndexOutOfBoundsException("Index Out Of Bounds");
        }
        int k = 0;
        int k2 = 0;
        Node temp;
        Node cur = head;
        Node cur2 = head;
        while (cur != null) {
            if (k == index && k2 == index) {
                temp = (E)cur.value;
                (E)cur.value = (E)cur2.value;
                (E)cur2.value = temp;
            }
            cur = cur.next;
            k++;
            k2++;
        }
    }
    public void push_second(E obj) {
        if (size <= 1) {
            throw ListIndexOutOfBoudsException;
        }
        Node temp = new Node(o, null,tail);
        tail.next = tail;
        tail.next = temp;
        tail = temp;
        size++;
    }

    public void pop_second() {
        if (size <= 1)
            throw ListIndexOutOfBoudsException;
        Node temp = head;
        while (temp.next) {
            temp = temp.next;
        }
        temp.next = new Node(o, null, tail);
        temp.prev = temp.prev.prev;
        size--;
    }

    public E[] toArray() {
        return null;
    }

    @Override
    public String toString() {
        String res = "[";
        Node cur = head;
        while(cur != null) {
            res = res + cur.value + ", ";
            cur = cur.next;
        }
        return res.substring(0, res.length()-2) + "]";
    }
}
