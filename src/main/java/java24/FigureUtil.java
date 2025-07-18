package java24;

import java.util.*;

public class FigureUtil {
    private static final Random rand = new Random();

    public static int getRandomInt(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    public static Point getRandomPoint() {
        return new Point(getRandomInt(0, 100), getRandomInt(0, 100));
    }

    public static Figure getRandomFigure() {
        return switch (rand.nextInt(3)) { // ← plus 4 mais 3 options seulement
            case 0 -> new Rond(getRandomPoint(), getRandomInt(1, 10));
            case 1 -> new Rectangle(getRandomPoint(), getRandomInt(5, 15), getRandomInt(5, 15));
            default -> new Carre(getRandomPoint(), getRandomInt(5, 15));
        };
    }

    public static List<Figure> trieProcheOrigine(Dessin d) {
        List<Figure> list = new ArrayList<>(d.getFigures());
        list.sort(Comparator.naturalOrder()); // utilise Comparable
        return list;
    }

    public static List<Figure> trieDominant(Dessin d) {
        List<Figure> list = new ArrayList<>();
        for (Figure f : d.getFigures()) {
            if (f instanceof Surfacable) {
                list.add(f);
            }
        }
        // Tri décroissant par surface
        list.sort((f1, f2) -> {
            double s1 = ((Surfacable) f1).surface();
            double s2 = ((Surfacable) f2).surface();
            return Double.compare(s2, s1); // décroissant
        });
        return list;
    }

}