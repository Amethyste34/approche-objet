package java14;

public class Point {
    public static final int INIT_X = 25;
    public static final int INIT_Y = 25;

    private int x;
    private int y;

    public Point() {
        this(INIT_X, INIT_Y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructeur de copie
    public Point(Point p) {
        this(p.x, p.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "[" + x + ";" + y + "]";
    }

    public void affiche() {
        System.out.println(toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point)) return false;
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }
}