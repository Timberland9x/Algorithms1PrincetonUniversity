package Week2Stack;

import java.io.*;

public class GenericTest<T> {

    T data;
    GenericTest<T> next;

    GenericTest(T data) {
        this.data = data;
        this.next = null;
    }

    public T getObject() {
        return this.data;
    }
}

class Main {
    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<Integer>(1);

        l.addLast(11);
        l.addLast(12);

        System.out.println("RemoveLast: " + l.removeLast());
        System.out.println("RemoveLast: " + l.removeLast());

        while (l.first != null) {
            System.out.println(l.getItem());
            l.first = l.getNext();
        }
    }
}