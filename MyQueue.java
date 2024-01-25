import java.util.LinkedList;

public class MyQueue<E> {
    private LinkedList<E> list = new LinkedList<>();

    public void push(E obj) {
        list.push(obj);
    }

    public void pop() {
        if list.size == 0 {
            throw new QueueStackException("Queue is Empty!");
        }
        else {
            list.pop();
        }
    }

    public E top() {
        return null;
    }

    public void multipop(int k) {
        if (k > list.size()) {
            throw new IndexOutOfBounds("Index Out Of Bounds!")
        }
        for (int i = 0; i < k; i++) {
            this.pop();
        }
    }
}
