package hu.petrik.oop;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    void Point() {
        x = 0;
        y = 0;
    }

    void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void Point(int n) {
        Random rnd = new Random();
        x = rnd.nextInt(n - (-n) + (-n));
        y = rnd.nextInt(n - (-n) + (-n));
    }

    public int getX(){
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
