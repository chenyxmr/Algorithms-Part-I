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
        first = null;
        last = null;
    }
    public boolean isEmpty() { return N == 0; }
    public int size() { return N; }
    
    public void addFirst(Item item) {
        if(item == null)
            throw new java.lang.IllegalArgumentException();
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.previous = null;
        if(isEmpty()) {
            first.next = null;
            last = first;
        }
        else {
            first.next = oldFirst;
            oldFirst.previous = first;
        }
        N++;
    }
    
    public void addLast(Item item) {
        if(item == null)
            throw new java.lang.IllegalArgumentException();
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) {
            last.previous = null;
            first = last;
        }
        else {
            last.previous = oldLast;
            oldLast.next = last;
        }
        N++;
    }
    
    public Item removeFirst() {
        if(isEmpty())
            throw new java.util.NoSuchElementException();
        Item item = first.item;
        first = first.next;
        N--;
        if(isEmpty()) last = null;
        else first.previous = null;
        return item;
    }
    
    public Item removeLast() {
        if(isEmpty())
            throw new java.util.NoSuchElementException();
        Item item = last.item;
        last = last.previous;
        N--;
        if(isEmpty()) first = null;
        else last.next = null;
        return item;
    }
    
    public Iterator<Item> iterator() {
        return new DequeIterator();
    }
    
    private class DequeIterator implements Iterator<Item> {
        private Node current = first;
        
        public boolean hasNext() {
            return current != null; 
        }
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
        public Item next() {
            if(!hasNext())
                throw new java.util.NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
    
    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<Integer>();
        deque.addFirst(3);
        deque.removeLast();
        Iterator<Integer> i = deque.iterator();
        while (i.hasNext())
        {
            Integer s = i.next();
            System.out.println(s);
        }
    }
}
