import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {    
    private int[] percolateNum;
    private double meanValue, stddevValue, confidenceLoValue, confidenceHiValue;
    // perform trials independent experiments on an n-by-n grid
    public PercolationStats(int n, int trials) {
        if(n <= 0 || trials <= 0)
            throw new java.lang.IllegalArgumentException();
        percolateNum = new int[trials];
        for(int i = 0; i < trials; i++) {
            Percolation percolation = new Percolation(n);
            while(true) {
                int row = StdRandom.uniform(1, n + 1);
                int col = StdRandom.uniform(1, n + 1);
                if(percolation.isOpen(row, col))
                    continue;
                percolation.open(row, col);
                if(percolation.percolates())
                    break;
            }
            percolateNum[i] = percolation.numberOfOpenSites();
        }
        meanValue = StdStats.mean(percolateNum) / (n * n);
        stddevValue = StdStats.stddev(percolateNum) / (n * n);
        confidenceLoValue = meanValue - 1.96 * stddevValue / Math.sqrt(trials);
        confidenceHiValue = meanValue + 1.96 * stddevValue / Math.sqrt(trials);
    }
    // sample mean of percolation threshold
    public double mean() {
        return meanValue;        
    }
    // sample standard deviation of percolation threshold
    public double stddev() {
        return stddevValue;        
        
    }
    // low  endpoint of 95% confidence interval
    public double confidenceLo() {
        return confidenceLoValue;
        
    }
    // high endpoint of 95% confidence interval
    public double confidenceHi() {
        return confidenceHiValue;
    }
    // test client (described below)
    public static void main(String[] args) {
        PercolationStats p = new PercolationStats(100, 100);
        System.out.println(p.mean());
        System.out.println(p.stddev());
        System.out.println(p.confidenceLo() + "   " + p.confidenceHi());
    }
}
