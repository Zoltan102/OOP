package hu.petrik.oop;

import java.util.Random;

public class Circle {
    private Point o;
    private int r;

    public Circle() {
        Random rnd = new Random();
        this.r = rnd.nextInt();
        this.o = new Point(100);
    }

    public Circle(int r) {
        this.r = r;
        this.o = new Point(0, 0);
    }

    public Circle(int r, Point o) {
        this.r = r;
        this.o = o;
    }

    public double Perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle{" + "o=" + o + ", r=" + r + '}';
    }
}
