import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private WeightedQuickUnionUF unionFind;
    private int size;
    private short[] stat;
    private int hi;
    private boolean isPercolate = false;
    private int openSites = 0;
    // create n-by-n grid, with all sites blocked
    public Percolation(int n) {
        if(n <= 0)
            throw new java.lang.IllegalArgumentException();
        unionFind = new WeightedQuickUnionUF(n * n + 3);
        size = n;
        stat = new short[n * n + 2]; // 0 0 0 0 isOpen isFull topConnected bottomConnected
        hi = 0;
        for(int i = 1; i <= n; i++) {
            unionFind.union(hi, i);
        }
        for(int i = 0; i <= n * n + 1; i++)
            stat[i] = 0;
    }
    // open site (row, col) if it is not open already
    public void open(int row, int col) {
        if(col < 1 || col > size || row < 1 || row > size) 
            throw new java.lang.IllegalArgumentException();
        if(isOpen(row, col))
            return;
        int offset = (row - 1) * size + col;
        if(row == 1) 
            stat[offset] |= 0x06;
        if(row == size)
            stat[offset] |= 0x01;
        if(row > 1 && isOpen(row - 1, col)) {
            stat[offset] |= (stat[unionFind.find(offset - size)] & 0x07);
            unionFind.union(offset, offset - size);
        }
        if(row < size && isOpen(row + 1, col)) {
            stat[offset] |= (stat[unionFind.find(offset + size)] & 0x07);
            unionFind.union(offset, offset + size);
        }
        if(col > 1 && isOpen(row, col - 1)) {
            stat[offset] |= (stat[unionFind.find(offset - 1)] & 0x07);
            unionFind.union(offset - 1, offset);
        }
        if(col < size && isOpen(row, col + 1)) {
            stat[offset] |= (stat[unionFind.find(offset + 1)] & 0x07);
            unionFind.union(offset + 1, offset);
        }
        stat[unionFind.find(offset)] |= (stat[offset] & 0x07);
        openSites++;
        stat[offset] |= 0x08;
        if((stat[offset] & 0x03) == 0x03)
            isPercolate = true;
    }
    // is site (row, col) open?
    public boolean isOpen(int row, int col) {
        if(col < 1 || col > size || row < 1 || row > size) 
            throw new java.lang.IllegalArgumentException();
        return (stat[(row - 1) * size + col] & 0x08) != 0;
    }
    // is site (row, col) full?
    public boolean isFull(int row, int col) {
        if(col < 1 || col > size || row < 1 || row > size) 
            throw new java.lang.IllegalArgumentException();
        /*return (stat[(row - 1) * size + col] & 0x04) > 0;*/
        if(!isOpen(row, col)) 
            return false;
        return unionFind.connected(0, (row - 1) * size + col);
    }
    // number of open sites
    public int numberOfOpenSites() {
        return openSites;
    }
    // does the system percolate?
    public boolean percolates() {
        return isPercolate;
        //return unionFind.connected(hi, lo);
    }
    // test client (optional)
    public static void main(String[] args) {
        Percolation p = new Percolation(100);
        while(true) {
            p.open(StdRandom.uniform(1, 101), StdRandom.uniform(1, 101));
            if(p.percolates())
                break;
        }
        System.out.println(p.numberOfOpenSites());
    }
 }