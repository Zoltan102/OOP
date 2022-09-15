package hu.petrik.oop;

public class Main {

    public static void main(String[] args) {
        Point[] points = new Point[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(100);
        }
        Write(points);
        int farthestPointIndex = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[farthestPointIndex].DistanceToOrigin() < points[i].DistanceToOrigin()){
                farthestPointIndex = i;
            }
        }
        System.out.printf("A legtávolabbi pont az origótól a(z) %d pont, koordinátái: %s, origótól mért távolság: %.3f", (farthestPointIndex + 1), points[farthestPointIndex], points[farthestPointIndex].DistanceToOrigin() );
    }

    public static void Write(Point[] points) {
        for (Point p : points) {
            System.out.println(p);
        }
    }


}
