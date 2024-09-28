package Week2Stack;

public class LinkedList<item> {

    Node<item> first = null;
    Node<item> last = null;

    class Node<item> {
        item t;
        Node<item> next;
        Node<item> pervious;

    }

    int length = 0;

    LinkedList() {
    }

    LinkedList(item t) {
        push(t);
    }

    public item getItem() {
        return first.t;
    }

    public Node<item> getNext() {
        return first.next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(item item) {
        if (first == null) {
            last = first;
        } else {
            Node<item> oldFirst = first;
            first = new Node<item>();
            first.t = item;
            first.next = oldFirst;
            length++;
        }
    }

    public void addLast(item item) {
        if (last == null) {
            push(item);
            last.pervious = last;
        } else {
            Node<item> newNode = new Node<>();
            last.pervious = last;
            last.next = newNode;
            last = newNode;
            newNode.t = item;
            newNode.next = null;
        }
        length++;
    }

    public item pop() {
        if (length > 0) {
            item items = first.t;
            first = first.next;
            length--;
            return items;
        }
        throw new java.util.NoSuchElementException();

    }

    public item removeLast() {
        if (length > 0) {
            item items = last.t;
            // System.out.println("last.pervious.t:" + last.pervious.t);
            last = last.pervious;
            length--;
            return items;
        }
        throw new java.util.NoSuchElementException();

    }

    public int length() {
        return length;
    }

    public boolean empty() {
        if (first == null) {
            return true;
        }
        return false;
    }

    public item getObject() {
        return this.first.t;
    }
}
