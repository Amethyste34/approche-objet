package java12;

import java.util.Random;

public class FigureUtil {

    private static final Random rand = new Random();

    public static Carre getRandomCarre() {
        Point origine = new Point(rand.nextInt(20), rand.nextInt(20));
        int cote = rand.nextInt(10) + 1; // côté entre 1 et 10
        return new Carre(origine, cote);
    }

    public static CarreHerite getRandomCarreHerite() {
        Point origine = new Point(rand.nextInt(20), rand.nextInt(20));
        int cote = rand.nextInt(10) + 1; // côté entre 1 et 10
        return new CarreHerite(origine, cote);
    }
}