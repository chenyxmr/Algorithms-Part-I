import java.util.Iterator;
import edu.princeton.cs.algs4.StdRandom;

public class RandomizedQueue<Item> implements Iterable<Item> {    
    private Item[] a = (Item[]) new Object[10];
    private int N = 0;
    
    public RandomizedQueue() {}
    public boolean isEmpty() { return N == 0; }
    public int size() { return N; }
    
    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for(int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }
    
    public void enqueue(Item item) {
        if(item == null)
            throw new java.lang.IllegalArgumentException();
        if(N == a.length)
            resize(2 * a.length);
        a[N++] = item;
    }
    public Item dequeue() {
        if(isEmpty())
            throw new java.util.NoSuchElementException();
        int position = StdRandom.uniform(N);
        Item item = a[position];
        a[position] = a[--N];
        a[N] = null;
        if(N > 0 && N == a.length/4)
            resize(a.length / 2);
        return item;
    }
    public Item sample() {
        if(isEmpty())
            throw new java.util.NoSuchElementException();
        int position = StdRandom.uniform(N);
        Item item = a[position];
        return item;
    }
    
    public Iterator<Item> iterator() {
        return new RandomizedQueueIterator();
    }
    private class RandomizedQueueIterator implements Iterator<Item> {
        Item[] temp = (Item[]) new Object[N];
        int pos = 0;
        public RandomizedQueueIterator(){
            for(int i = 0; i < N; i++)
                temp[i] = a[i];
            StdRandom.shuffle(temp);
        }
        public boolean hasNext() {
            return pos < N;
        }
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
        public Item next() {
            if(!hasNext())
                throw new java.util.NoSuchElementException();
            return temp[pos++];
        }
    }
    
    public static void main(String[] args) {
        RandomizedQueue<Integer> deque = new RandomizedQueue<Integer>();
        deque.enqueue(3);
        deque.enqueue(3);
        Iterator<Integer> i = deque.iterator();
        while (i.hasNext())
        {
            Integer s = i.next();
            System.out.println(s);
        }
    }
}