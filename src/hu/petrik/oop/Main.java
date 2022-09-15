package hu.petrik.oop;

public class Main {

    public static void main(String[] args) {
        Point[] points = new Point[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(100);
        }
        Write(points);
    }

    public static void Write(Point[] points) {
        for (Point p : points) {
            System.out.println(p);
        }
    }
}
