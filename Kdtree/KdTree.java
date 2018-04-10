import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.Queue;

public class KdTree {
    private Node root;
    private int size;
    private static class Node {
        private Point2D p;
        private RectHV rect;
        private Node lb;
        private Node rt;
        public Node(Point2D p, RectHV rect) {
            this.p = p;
            if(rect == null)
                this.rect = new RectHV(0, 0, 1, 1);
            else
                this.rect = rect;
        }
     }
     public KdTree() {
         size = 0;
     }
     public boolean isEmpty() {
         return size == 0;
     }
     public int size() {
         return size;
     }
     public void insert(Point2D p) {
         if(p == null)
             throw new java.lang.IllegalArgumentException();
         if(root == null) 
             root = insertV(root, p, null);
         else 
             root = insertV(root, p, root.rect);
     }
     private Node insertV(Node node, Point2D p, RectHV rect) {
         if(node == null) {
             size++;
             return new Node(p, rect);
         }
         if(node.p.equals(p))
            return node;
         RectHV r;
         if(p.x() < node.p.x()) {
             if(node.lb == null)
                 r = new RectHV(rect.xmin(), rect.ymin(), node.p.x(), rect.ymax());
             else
                 r = node.lb.rect;
             node.lb = insertH(node.lb, p, r);
         }
         else {
             if(node.rt == null)
                 r = new RectHV(node.p.x(), rect.ymin(), rect.xmax(), rect.ymax());
             else
                 r = node.rt.rect;
             node.rt = insertH(node.rt, p, r);
         }
         return node;
     }
     private Node insertH(Node node, Point2D p, RectHV rect) {
         if(node == null) {
             size++;
             return new Node(p, rect);
         }
         if(node.p.equals(p))
             return node;
         RectHV r;
         if(p.y() < node.p.y()) {
             if(node.lb == null)
                 r = new RectHV(rect.xmin(), rect.ymin(), rect.xmax(), node.p.y());
             else
                 r = node.lb.rect;
             node.lb = insertV(node.lb, p, r);
         }
         else {
             if(node.rt == null)
                 r = new RectHV(rect.xmin(), node.p.y(), rect.xmax(), rect.ymax());
             else
                 r = node.rt.rect;
             node.rt = insertV(node.rt, p, r);
         }
         return node;
     }
     public boolean contains(Point2D p) {
         if(p == null)
             throw new java.lang.IllegalArgumentException();
         return contains(root, p, true);
     }
     private boolean contains(Node node, Point2D p, boolean vertical) {
         if(node == null)
             return false;
         if(node.p.equals(p))
             return true;
         int cmp;
         if(vertical) 
             cmp = Point2D.X_ORDER.compare(p, node.p);
         else
             cmp = Point2D.Y_ORDER.compare(p, node.p);
         if(cmp >= 0)
             return contains(node.rt, p, !vertical);
         else
             return contains(node.lb, p, !vertical);
     }
     public void draw() {
         draw(root, true);
     }
     private void draw(Node node, boolean vertical) {
         if(node == null)
             return;
         draw(node.lb, !vertical);
         StdDraw.setPenColor(StdDraw.BLACK);
         StdDraw.setPenRadius(0.01);
         node.p.draw();
         StdDraw.setPenRadius();
         if(vertical) { 
             StdDraw.setPenColor(StdDraw.RED);
             StdDraw.line(node.p.x(), node.rect.ymin(), node.p.x(), node.rect.ymax());
         }
         else {
             StdDraw.setPenColor(StdDraw.BLUE);
             StdDraw.line(node.rect.xmin(),node.p.y(), node.rect.xmax(),node.p.y());
         }
         draw(node.rt, !vertical);
     }
     public Iterable<Point2D> range(RectHV rect){
         if(rect == null)
             throw new java.lang.IllegalArgumentException();
         Queue<Point2D> q = new Queue<Point2D>();
         range(root, rect, q);
         return q;
     }
     private void range(Node node, RectHV rect, Queue<Point2D> q) {
         if(node == null)
             return;
         if(node.lb != null && rect.intersects(node.lb.rect))
             range(node.lb, rect, q);
         if(rect.contains(node.p))
             q.enqueue(node.p);
         if(node.rt != null && rect.intersects(node.rt.rect))
             range(node.rt, rect, q);
         return;
     }
     public Point2D nearest(Point2D p) {
         if(p == null)
             throw new java.lang.IllegalArgumentException();
         if(root == null)
             return null;
         return nearest(root, p, root.p, true);
     }
     private Point2D nearest(Node node, Point2D p, Point2D min, boolean vertical) {
         if(p.distanceSquaredTo(node.p) < p.distanceSquaredTo(min))
             min = node.p;
         boolean lb, rt;
         if(node.lb == null) lb = false;
         else lb = node.lb.rect.distanceSquaredTo(p) < min.distanceSquaredTo(p);
         if(node.rt == null) rt = false;
         else rt = node.rt.rect.distanceSquaredTo(p) < min.distanceSquaredTo(p);
         if(lb && rt) {
             int dir = (vertical? Point2D.X_ORDER: Point2D.Y_ORDER).compare(p, node.p);
             if(dir < 0) {
                 min = nearest(node.lb, p, min, !vertical);
                 if(node.rt.rect.distanceSquaredTo(p) < min.distanceSquaredTo(p))
                     min = nearest(node.rt, p, min, !vertical);
             }
             else {
                 min = nearest(node.rt, p, min, !vertical);
                 if(node.lb.rect.distanceSquaredTo(p) < min.distanceSquaredTo(p))
                     min = nearest(node.lb, p, min, !vertical);
             }
         }
         else if(lb && !rt)
             min = nearest(node.lb, p, min, !vertical);
         else if(!lb && rt)
             min = nearest(node.rt, p, min, !vertical);
         else
             ;
         return min;         
     }

     public static void main(String[] args) {
         
     }
 }