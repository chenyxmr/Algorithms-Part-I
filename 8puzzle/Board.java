import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.In;

public class Board {
    private int n;
    private int manhattan = 0;
    private int[][] blocks;
    public Board(int[][] blocks){
        if(blocks == null)
            throw new java.lang.IllegalArgumentException();
        n= blocks.length;
        this.blocks = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++) {
                this.blocks[i][j] = blocks[i][j];
                if(blocks[i][j] != i * n + j + 1 && blocks[i][j] != 0)
                    manhattan += abs((blocks[i][j]-1)/n - i) + abs(((blocks[i][j]-1)%n - j));
            }
    }
    public int dimension() {
        return n;
    }
    public int hamming() {
        int hamming = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++) 
                if(blocks[i][j] != i * n + j + 1 && blocks[i][j] != 0)
                    hamming++;
        return hamming;
    }
    public int manhattan() {
        return manhattan;
    }
    public boolean isGoal() {
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++) 
                if(blocks[i][j] != i * n + j + 1 && blocks[i][j] != 0)
                    return false;
        return true;
    }
    public Board twin() {
        int[][] b = new int[n][n];
        for(int i = 0; i < n; i++) 
            for(int j = 0; j < n; j++) 
                b[i][j] = blocks[i][j];
        if(blocks[0][0] != 0 && blocks[0][1] != 0)
            swap(b, 0, 0, 0 ,1);
        else 
            swap(b, 1, 0, 1 ,1);
        return new Board(b);
    }
    public boolean equals(Object y) {
        if(y == null) return false;
        if(y == this) return true;
        if(y.getClass() != this.getClass())
            return false;

        Board that = (Board)y;
        if(n != that.n) return false;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(blocks[i][j] != that.blocks[i][j])
                    return false;
        return true;
    }
    public Iterable<Board> neighbors(){
        Queue<Board> pq = new Queue<Board>();
        int[][] b = new int[n][n];
        int x = -1, y = -1;
        for(int i = 0; i < n; i++) 
            for(int j = 0; j < n; j++) 
                b[i][j] = blocks[i][j];
        find: for(int i = 0; i < n; i++) 
            for(int j = 0; j < n; j++) 
                if(b[i][j] == 0) {
                    x = i; y = j; break find;
                }
        if(x > 0) {
            swap(b, x, y, x - 1, y);
            pq.enqueue(new Board(b));
            swap(b, x, y, x - 1, y);
        }
        if(x < n-1) {
            swap(b, x, y, x + 1, y);
            pq.enqueue(new Board(b));
            swap(b, x, y, x + 1, y);
        }
        if(y > 0) {
            swap(b, x, y, x, y - 1);
            pq.enqueue(new Board(b));
            swap(b, x, y, x, y - 1);
        }
        if(y < n - 1) {
            swap(b, x, y, x, y + 1);
            pq.enqueue(new Board(b));
            swap(b, x, y, x, y + 1);
        }
        return pq;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(n + "\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s.append(String.format("%2d ", blocks[i][j]));
            }
            s.append("\n");
        }
        return s.toString();
    }
    
    private int abs(int x) {
        if(x >= 0)
            return x;
        else
            return -x;
    }
    
    private void swap(int[][]a, int x1, int y1, int x2, int y2) {
        int tmp = a[x1][y1]; 
        a[x1][y1] = a[x2][y2];
        a[x2][y2] = tmp;
    }
    public static void main(String[] args) {
        In in = new In(args[0]);
        int n = in.readInt();
        int[][] blocks = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                blocks[i][j] = in.readInt();
        Board initial = new Board(blocks);
        System.out.println(initial.toString());
    }
}
