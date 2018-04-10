import edu.princeton.cs.algs4.SET;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;

public class PointSET {
    private SET<Point2D> set;
    public         PointSET() {
        set = new SET<Point2D>();
    }
    public boolean isEmpty() {
        return set.size() == 0;
    }
    public int size() {
        return set.size();
    }
    public void insert(Point2D p) {
        if(p == null)
            throw new java.lang.IllegalArgumentException();
        set.add(p);
    }
    public boolean contains(Point2D p) {
        if(p == null)
            throw new java.lang.IllegalArgumentException();
        return set.contains(p);
    }
    public void draw() {
        for (Point2D p: set) {
            p.draw();
        }
    }
    public Iterable<Point2D> range(RectHV rect){
        if(rect == null)
            throw new java.lang.IllegalArgumentException();
        Queue<Point2D> q = new Queue<Point2D>();
        for (Point2D p: set) {
            if(rect.contains(p))
                q.enqueue(p);
        }
        return q;
    }
    public Point2D nearest(Point2D p) {
        if(p == null)
            throw new java.lang.IllegalArgumentException();
        double minDistance = 2;
        Point2D minPoint = null;
        double distance;
        for (Point2D point: set) {
            distance = point.distanceSquaredTo(p);
            if(distance <= minDistance) {
                minDistance = distance;
                minPoint = point;
            }
        }
        return minPoint;
    }

    public static void main(String[] args) {
        
    }
 }