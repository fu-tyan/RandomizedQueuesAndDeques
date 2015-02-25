import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int N;

    private class Node {
        Item item;
        Node next;
        Node previous;
    }

    public Deque() {

    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void addFirst(Item item) {

    }

    public void addLast() {

    }

    public Item removeFirst() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        } else {
            first.previous = null;
        }
        N--;
        return item;
    }

    public Item removeLast() {
        Item item = last.item;
        last = last.previous;
        if (isEmpty()) {
            first = null;
        } else {
            last.next = null;
        }
        N--;
        return item;
    }

    public Iterator<Item> iterator()
    {

    }

    public static void main(String[] args)
    {

    }
}
