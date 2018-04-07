import java.util.Comparator;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import edu.princeton.cs.algs4.MinPQ;
public class Solver {
    private MinPQ<Node> pq, twinPq;
    private boolean isSolvable;
    private Node node;
    private Node minNode;
    public Solver(Board initial) {
        if(initial == null)
            throw new java.lang.IllegalArgumentException();
        pq = new MinPQ<Node>(new PriorityOrder());
        twinPq = new MinPQ<Node>(new PriorityOrder());
        node = new Node(initial, 0, null);
        Node twinNode = new Node(initial.twin(), 0, null);
        while(!node.board.isGoal() && !twinNode.board.isGoal()) {
            for(Board b: node.board.neighbors()) 
                if(node.preNode == null || !b.equals(node.preNode.board)) 
                    pq.insert(new Node(b, node.moves + 1, node));
            for(Board b: twinNode.board.neighbors()) 
                if(twinNode.preNode == null || !b.equals(twinNode.preNode.board)) 
                    twinPq.insert(new Node(b, twinNode.moves + 1, twinNode));
            node = pq.delMin();
            twinNode = twinPq.delMin();
        }
        if(node.board.isGoal()) {isSolvable = true; }
        else {isSolvable = false; node = twinNode;}
        minNode = node;
    }
    private class Node{
        private int moves;
        private Board board;
        private Node preNode;
        private int priority;
        public Node(Board board, int moves, Node preNode) {
            this.board = board;
            this.moves = moves;
            this.preNode = preNode;
            priority = board.manhattan() + moves;
        }
    }
    private class PriorityOrder implements Comparator<Node> {
        public int compare(Node s1, Node s2) {            
            if (s1.priority > s2.priority) return 1;
            else if (s1.priority < s2.priority) return -1;
            else return 0;
        }
    }
    public boolean isSolvable() {
        return isSolvable;
    }
    public int moves() {
        if(!isSolvable) return -1;
        return minNode.moves;
    }
    public Iterable<Board> solution(){
        if(!isSolvable) return null;
        Stack<Board> stack = new Stack<Board>();
        Node n = node;
        stack.push(n.board);
        while(n.preNode != null) {
            n = n.preNode;
            stack.push(n.board);
        }
        return stack;
    }
    public static void main(String[] args) {
        In in = new In(args[0]);
        int n = in.readInt();
        int[][] blocks = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                blocks[i][j] = in.readInt();
        Board initial = new Board(blocks);

        // solve the puzzle
        Solver solver = new Solver(initial);

        // print solution to standard output
        if (!solver.isSolvable())
            StdOut.println("No solution possible");
        else {
            StdOut.println("Minimum number of moves = " + solver.moves());
            for (Board board : solver.solution())
                StdOut.println(board);
        }
    }
}