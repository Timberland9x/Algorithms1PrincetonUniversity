package Week2Stack;

import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
    LinkedList<Item> ll = new LinkedList<Item>();

    // construct an empty deque
    public Deque() {
        
    }

    // is the deque empty?
    public boolean isEmpty() {
        return ll.empty();
    }

    // return the number of items on the deque
    public int size() {
        return ll.length();
    }

    // add the item to the front
    public void addFirst(Item item) {
        ll.push(item);
    }

    // add the item to the back
    public void addLast(Item item) {
        ll.addLast(item);
    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (ll.empty()) {
            throw new java.util.NoSuchElementException();
        }
        return ll.pop();
    }

    // // remove and return the item from the back
    public Item removeLast() {
        if (ll.empty()) {
            throw new java.util.NoSuchElementException();
        }
        return ll.removeLast();
    }

    // // return an iterator over items in order from front to back
    // public Iterator<Item> iterator(){
    // Iterator i = new Iterator;
    // return i

    // }

    // unit testing (required)
    public static void main(String[] args) {
        Deque<Integer> test = new Deque<Integer>();
        test.addFirst(1);
        test.addFirst(2);
        test.addFirst(3);
        while (test.isEmpty()) {

        }
    }

    @Override
    public Iterator<Item> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

}