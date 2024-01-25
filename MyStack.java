import java.util.LinkedList;

public class MyStack<E> {
    public int top = 0;

    public Stack() {
        this.top = top;
    }

    private LinkedList<E> list = new LinkedList<>();

    public void push(E obj) {
        list.push(obj);
    }

    public void pop() {
        if (list.size == 0) {
            throw new EmptyStackException();
        } else {
            list.pop();
        }
    }

    public E top() {
        return null;
    }

    public void multipop(int k) {
        for (int i = 0; top != null && i < k; i++) {
            this.pop();
        }
    }
}
 public class Main {
    public static void main(String[] args) {

    }
 }
