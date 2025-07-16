package java13;

import java.util.Random;

public class FigureUtil {
    private static final Random rand = new Random();

    public static int getRandomInt(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    public static Point getRandomPoint() {
        int x = getRandomInt(0, 100);
        int y = getRandomInt(0, 100);
        return new Point(x, y);
    }

    public static Rectangle getRandomRectangle() {
        Point p1 = getRandomPoint();
        int width = getRandomInt(1, 20);
        int height = getRandomInt(1, 20);
        Point p2 = new Point(p1.getX() + width, p1.getY());
        Point p3 = new Point(p1.getX() + width, p1.getY() + height);
        Point p4 = new Point(p1.getX(), p1.getY() + height);
        return new Rectangle(p1, p2, p3, p4);
    }

    public static Carre getRandomCarre() {
        Point p = getRandomPoint();
        int taille = getRandomInt(1, 20);
        return new Carre(p, taille);
    }

    public static CarreHerite getRandomCarreHerite() {
        Point p = getRandomPoint();
        int taille = getRandomInt(1, 20);
        return new CarreHerite(p, taille);
    }
}