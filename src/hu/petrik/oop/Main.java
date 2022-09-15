package hu.petrik.oop;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(0, 0);
        Point p3 = new Point(3, 4);
        Point p4 = new Point(5);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
