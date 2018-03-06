import java.util.ArrayList;
import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class FastCollinearPoints {
    private Point[] points;
    private Point[] pointsCopy;
    private ArrayList<LineSegment> lineSegments = new ArrayList<LineSegment>();
    public FastCollinearPoints(Point[] points) {
        this.points = points;
        if(points == null || checkNullandDuplicate())
            throw new java.lang.IllegalArgumentException();
        this.pointsCopy = Arrays.copyOf(points, points.length);
        Arrays.sort(pointsCopy);
        for(int i = 0; i < pointsCopy.length - 3; i++) {
            Arrays.sort(pointsCopy);
            Arrays.sort(pointsCopy, pointsCopy[i].slopeOrder());
            for(int first = 1, last = 2; last < pointsCopy.length; last++) {
                while(last < pointsCopy.length && 
                        Double.compare(pointsCopy[0].slopeTo(pointsCopy[first]), pointsCopy[0].slopeTo(pointsCopy[last])) == 0)
                        last++;
                if(last - first >= 3 && pointsCopy[0].compareTo(pointsCopy[first]) < 0)
                    lineSegments.add(new LineSegment(pointsCopy[0], pointsCopy[last - 1]));
                first = last;
            }
        }
    }
    public int numberOfSegments() {
        return lineSegments.size();
    }
    public LineSegment[] segments() {
        return lineSegments.toArray(new LineSegment[lineSegments.size()]);
    }
    private boolean checkNullandDuplicate() {
        for(int i = 0; i < points.length; i++)
            if(points[i] == null)
                return true;
        for(int i = 0; i < points.length; i++)
            for(int j = i + 1; j < points.length; j++) 
                if(points[i].compareTo(points[j]) == 0)
                    return true;
        return false;
    }
    
    public static void main(String[] args) {

        // read the n points from a file
        In in = new In("equidistant.txt");
        int n = in.readInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            int y = in.readInt();
            points[i] = new Point(x, y);
        }

        // draw the points
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
        for (Point p : points) {
            p.draw();
        }
        StdDraw.show();

        // print and draw the line segments
        FastCollinearPoints collinear = new FastCollinearPoints(points);
        for (LineSegment segment : collinear.segments()) {
            StdOut.println(segment);
            segment.draw();
        }
        StdDraw.show();
    }
}
