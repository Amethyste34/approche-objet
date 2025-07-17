package java21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class FigureUtil {
    private static final Random rand = new Random();

    public static int getRandomInt(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    public static Point getRandomPoint() {
        return new Point(getRandomInt(0, 100), getRandomInt(0, 100));
    }

    // Génère une figure avec un point aléatoire
    public static Figure getRandomFigure() {
        Point p = getRandomPoint();
        return switch (rand.nextInt(5)) {
            case 0 -> new Segment(p, getRandomInt(1, 10), rand.nextBoolean());
            case 1 -> new Rond(p, getRandomInt(1, 10));
            case 2 -> new Rectangle(p, getRandomInt(2, 12), getRandomInt(2, 12));
            case 3 -> new Carre(p, getRandomInt(2, 12));
            default -> new CarreHerite(p, getRandomInt(2, 12));
        };
    }

    // Génère une figure à partir d’un Point donné
    public static Figure getRandomFigure(Point p) {
        return switch (rand.nextInt(5)) {
            case 0 -> new Segment(p, getRandomInt(1, 10), rand.nextBoolean());
            case 1 -> new Rond(p, getRandomInt(1, 10));
            case 2 -> new Rectangle(p, getRandomInt(2, 12), getRandomInt(2, 12));
            case 3 -> new Carre(p, getRandomInt(2, 12));
            default -> new CarreHerite(p, getRandomInt(2, 12));
        };
    }

    // À compléter : Surfacable et autres classes manquantes (Rond, Segment...)

    public static Collection<Figure> genere(int n) {
        Collection<Figure> figures = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            figures.add(getRandomFigure());
        }
        return figures;
    }
}