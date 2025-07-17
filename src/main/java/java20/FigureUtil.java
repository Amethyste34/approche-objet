package java20;

import java.util.Random;

public class FigureUtil {
    private static final Random rand = new Random();

    public static int getRandomInt(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    public static Point getRandomPoint() {
        return new Point(getRandomInt(0, 100), getRandomInt(0, 100));
    }

    public static Figure getRandomFigure() {
        int type = getRandomInt(1, 5);
        switch (type) {
            case 1:
                return new Rond(getRandomPoint(), getRandomInt(1, 20));
            case 2:
                return new Carre(getRandomPoint(), getRandomInt(1, 20));
            case 3:
                return new CarreHerite(getRandomPoint(), getRandomInt(1, 20));
            case 4:
                Point p1 = getRandomPoint();
                int w = getRandomInt(1, 20);
                int h = getRandomInt(1, 20);
                Point p2 = new Point(p1.getX() + w, p1.getY());
                Point p3 = new Point(p1.getX() + w, p1.getY() + h);
                Point p4 = new Point(p1.getX(), p1.getY() + h);
                return new Rectangle(p1, p2, p3, p4);
            case 5:
            default:
                return new Segment(getRandomPoint(), getRandomInt(1, 30), rand.nextBoolean());
        }
    }

    public static Surfacable getRandomSurfacable() {
        int type = getRandomInt(1, 3);
        switch (type) {
            case 1:
                return new Rond(getRandomPoint(), getRandomInt(1, 20));
            case 2:
                return new Carre(getRandomPoint(), getRandomInt(1, 20));
            case 3:
            default:
                Point p1 = getRandomPoint();
                int w = getRandomInt(1, 20);
                int h = getRandomInt(1, 20);
                Point p2 = new Point(p1.getX() + w, p1.getY());
                Point p3 = new Point(p1.getX() + w, p1.getY() + h);
                Point p4 = new Point(p1.getX(), p1.getY() + h);
                return new Rectangle(p1, p2, p3, p4);
        }
    }

    public static Point[] getPoints(Figure... figures) {
        // Premier passage : je compte les points
        int totalPoints = 0;
        for (Figure fig : figures) {
            totalPoints += fig.getPoints().length;
        }

        // Deuxième passage : je remplis le tableau
        Point[] result = new Point[totalPoints];
        int index = 0;
        for (Figure fig : figures) {
            for (Point pt : fig.getPoints()) {
                result[index++] = pt;
            }
        }

        return result;
    }
}