import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private int capacity = 10;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[capacity];
    }

    public void add(E obj) {
        if(size == elements.length) {
            int newSize = elements.length*2;
            elements = Arrays.copyOf(elements, newSize);
        }
        elements[size++] = obj;
    }

    public E get(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of Bounds");
        }
        return (E)elements[index];
    }

    public void swap(int ind1, int ind2) {
        if (ind1 < 0 || ind 2 < 0 || ind1 >= size || ind2 >= size) {
            throw new IndexOutOfBoundsException("Index Out Of Bounds");
        }
    }

    public void push_second(E obj) {
        if (size <= 1) {
            throw new ArrayIndexOutOfBoundsException("Index Out Of Bounds");
        }
        if (size + 1 == capacity) {
            capacity = capacity*2;
        }
        Object[] o = new Object[capacity];
        for (int i = 0; i < size + 1; i++) {
            if (i == 1) {
                o[i] = obj;
            } else if (i < 1) {
                o[i] = elements[i];
            } else {
                o[i] = elements[i - 1];
            }
        }
        elements = o;
        size++;
    }

    public void pop_second() {
        if (size <= 1) {
            throw new ArrayIndexOutOfBoundsException("Index Out Of Bounds");
        }
        k = size - 1;
        k2 = size - 2;
        swap(k, k2);
        elements[k] = null;
        size--;
    }

    public E[] toArray() {
    	return null;
    }

    @Override
    public String toString() {
        // [1,2,3,4,5]
        String res = "[";
        for(int i = 0; i < size; i++) {
            res = res + elements[i] + ", ";
        }
        return res.substring(0, res.length()-2) + "]";
    }
}
