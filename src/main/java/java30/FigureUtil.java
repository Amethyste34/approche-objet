package java30;

import java.util.*;

public class FigureUtil {
    private static final Random rand = new Random();
    private static final Map<String, Figure> figuresMap = new HashMap<>();

    public static int getRandomInt(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    public static Point getRandomPoint() {
        return new Point(getRandomInt(0, 100), getRandomInt(0, 100));
    }

    public static Couleur getRandomCouleur() {
        Couleur[] couleurs = Couleur.values();
        return couleurs[rand.nextInt(couleurs.length)];
    }

    public static Figure getRandomFigure() {
        return switch (rand.nextInt(3)) {  // 3 cas : 0,1,2
            case 0 -> new Rond(getRandomCouleur(), getRandomPoint(), getRandomInt(1, 10));
            case 1 -> new Rectangle(getRandomPoint(), getRandomInt(5, 15), getRandomInt(5, 15), getRandomCouleur());
            case 2 -> new Carre(getRandomPoint(), getRandomInt(5, 15), getRandomCouleur());
            default -> throw new IllegalStateException("Unexpected value");
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
            return Double.compare(s2, s1);
        });
        return list;
    }

    public static Carre getRandomCarre(String id) {
        Carre c = new Carre(new Point(10, 10), 20, getRandomCouleur());
        figuresMap.put(id, c);
        return c;
    }

    public static CarreHerite getRandomCarreHerite(String id) {
        CarreHerite ch = new CarreHerite(new Point(30, 30), 15, getRandomCouleur());
        figuresMap.put(id, ch);
        return ch;
    }

    public static Rectangle getRandomRectangle(String id) {
        Rectangle r = new Rectangle(new Point(50, 50), 30, 10, getRandomCouleur());
        figuresMap.put(id, r);
        return r;
    }

    public static Rond getRandomRond(String id) {
        Rond rond = new Rond(getRandomCouleur(), new Point(25, 25), 10);
        figuresMap.put(id, rond);
        return rond;
    }

    public static Figure get(String id) {
        return figuresMap.get(id);
    }
}