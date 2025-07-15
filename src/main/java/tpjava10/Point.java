package tpjava10;

public class Point {
    private static final int INIT_X = 25;
    private static final int INIT_Y = 25;

    private int x;
    private int y;

    // Constructeur classique
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructeur par défaut
    public Point() {
        this.x = INIT_X;
        this.y = INIT_Y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }
}