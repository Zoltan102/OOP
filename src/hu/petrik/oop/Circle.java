package hu.petrik.oop;

import java.util.Random;

public class Circle {
    private Point o;
    private int r;

    public Circle() {
        Random rnd = new Random();
        this.r = rnd.nextInt(100);
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

    public void Resize(int i) {
        if (i < 0) {
            r /= -i;
        } else if (i > 0) {
            r *= i;
        }
    }

    public double Perimeter() {
        return 2 * Math.PI * r;
    }

    public double Area() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public String toString() {
        return "o=" + o + ", r=" + r;
    }
}
