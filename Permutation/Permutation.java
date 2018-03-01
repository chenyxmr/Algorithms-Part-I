import edu.princeton.cs.algs4.StdIn;

public class Permutation {
    //private static final 
    public static void main(String[] args) {
        RandomizedQueue<String> randomizedQueue = new RandomizedQueue<String>();
        int k = Integer.parseInt(args[0]);
        while(!StdIn.isEmpty()) {
            String item = StdIn.readString();
            randomizedQueue.enqueue(item);
        }
        for(int i = 0; i < k; i++) {
            System.out.println(randomizedQueue.dequeue());
        }
    }
}
