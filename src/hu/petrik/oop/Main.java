package hu.petrik.oop;

public class Main {

    public static void main(String[] args) {
        Points();
        Circles();
    }

    public static void Points() {
        Point[] points = new Point[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(100);
        }
        for (Point p : points) {
            System.out.println(p);
        }
        int farthestPointIndex = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[farthestPointIndex].DistanceToOrigin() < points[i].DistanceToOrigin()) {
                farthestPointIndex = i;
            }
        }
        System.out.printf("A legtávolabbi pont az origótól a(z) %d pont, koordinátái: %s, origótól mért távolság: %.3f",
                (farthestPointIndex + 1), points[farthestPointIndex], points[farthestPointIndex].DistanceToOrigin());
        System.out.printf("\nA két pont távolsága: %.3f pont az 1. pont koordinátái: %s, a 2. pont koordinátái: %s",
                points[0].DistanceToOtherPoint(points[1]), points[0], points[1]);

        System.out.printf("\nA pont a függvény %d. részén található", points[1].Quarter());
    }

    public static void Circles() {
        Circle[] circles = new Circle[10];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
        }
        for (Circle c : circles) {
            System.out.println(c);
        }
        int biggestCircleIndex = 0;
        for (int i = 0; i < circles.length; i++) {
            if (circles[i].Area() > circles[biggestCircleIndex].Area()) {
                biggestCircleIndex = i;
            }
        }
        System.out.printf("A legnagyobb területű kör a(z) %d. kör, %s, területe: %.3f",
                biggestCircleIndex, circles[biggestCircleIndex], circles[biggestCircleIndex].Area());
    }
}
