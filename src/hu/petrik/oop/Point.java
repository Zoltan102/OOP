package hu.petrik.oop;

public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int n) {
        this.x = (int) (Math.random() * ((2 * n) + 1)) - n;
        this.y = (int) (Math.random() * ((2 * n) + 1)) - n;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return String.format("[%d;%d]", this.x, this.y);
    }
}
