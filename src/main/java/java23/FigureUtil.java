package java23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class FigureUtil {
    private static final Random rand = new Random();

    public static int getRandomInt(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    public static Point getRandomPoint() {
        return new Point(getRandomInt(0, 99), getRandomInt(0, 99));
    }

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

    // Choix de ArrayList car liste simple, accès rapide avec doublons possibles car figures aléatoires
    public static Collection<Figure> genere(int n) {
        Collection<Figure> figures = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            figures.add(getRandomFigure());
        }
        return figures;
    }

    // Choix ArrayList, collection ordonnée, facile à manipuler et à parcourir
    public static Collection<Point> getPoints(Figure... figures) {
        Collection<Point> points = new ArrayList<>();
        for (Figure f : figures) {
            points.addAll(f.getPoints());
        }
        return points;
    }

    public static Figure getFigureEn(Point p, Dessin d) {
        Iterator<Figure> it = d.getFigures().iterator();
        while (it.hasNext()) {
            Figure f = it.next();
            if (f.couvre(p)) {
                return f;
            }
        }
        return null;
    }
}