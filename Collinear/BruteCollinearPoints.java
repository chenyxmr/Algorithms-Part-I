import java.util.ArrayList;
import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class BruteCollinearPoints {
    private Point[] points;
    private Point[] pointsCopy;
    private ArrayList<LineSegment> lineSegments = new ArrayList<LineSegment>();
    public BruteCollinearPoints(Point[] points) {
        this.points = points;
        if(points == null || checkNullandDuplicate())
            throw new java.lang.IllegalArgumentException();
        this.pointsCopy = Arrays.copyOf(points, points.length);
        double slope1, slope2, slope3;
        Point pointMin, pointMax;
        for(int i = 0; i < pointsCopy.length - 3; i++) {
            for(int j = i + 1; j < pointsCopy.length - 2; j++) {
                slope1 = pointsCopy[i].slopeTo(pointsCopy[j]);
                for(int k = j + 1; k < pointsCopy.length - 1; k++) {
                    slope2 = pointsCopy[i].slopeTo(pointsCopy[k]);
                    if(slope1 != slope2)
                        continue;
                    for(int l = k + 1; l < pointsCopy.length; l++) {
                        slope3 = pointsCopy[i].slopeTo(pointsCopy[l]);
                        if(slope1 != slope3)
                            continue;
                        pointMin = pointsCopy[i];
                        pointMin = pointMin.compareTo(pointsCopy[j]) > 0 ? pointsCopy[j] : pointMin;
                        pointMin = pointMin.compareTo(pointsCopy[k]) > 0 ? pointsCopy[k] : pointMin;
                        pointMin = pointMin.compareTo(pointsCopy[l]) > 0 ? pointsCopy[l] : pointMin;
                        pointMax = pointsCopy[i];
                        pointMax = pointMax.compareTo(pointsCopy[j]) < 0 ? pointsCopy[j] : pointMax;
                        pointMax = pointMax.compareTo(pointsCopy[k]) < 0 ? pointsCopy[k] : pointMax;
                        pointMax = pointMax.compareTo(pointsCopy[l]) < 0 ? pointsCopy[l] : pointMax;
                        lineSegments.add(new LineSegment(pointMin, pointMax));
                    }
                }
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
        BruteCollinearPoints collinear = new BruteCollinearPoints(points);
        for (LineSegment segment : collinear.segments()) {
            StdOut.println(segment);
            segment.draw();
        }
        StdDraw.show();
    }
}
