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
        this.x = generateCoordinates(n);
        this.y = generateCoordinates(n);
    }

    private int generateCoordinates(int n) {
        return (int) (Math.random() * ((2 * n) + 1)) - n;
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

    public double DistanceToOrigin() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double DistanceToOtherPoint(Point p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    //1: bal felső
    //2: jobb felső
    //3: bal alsó
    //4: jobb alsó
    //0: origó
    public int Quarter() {
        int quarter;
        if (x > 0 && y < 0) {
            quarter = 1;
        } else if (x > 0 && y > 0) {
            quarter = 2;
        } else if (x < 0 && y < 0) {
            quarter = 3;
        } else if (x < 0 && y > 0) {
            quarter = 4;
        } else {
            quarter = 0;
        }
        return quarter;
    }

    @Override
    public String toString() {
        return String.format("[%d;%d]", x, y);
    }
}
