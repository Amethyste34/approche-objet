package tpjava10;

import java.util.Random;

public class FigureUtil {
    private static final Random random = new Random();

    // Méthode privée pour générer un point aléatoire
    private static Point getRandomPoint() {
        int x = random.nextInt(101); // Valeurs entre 0 et 100
        int y = random.nextInt(101);
        return new Point(x, y);
    }

    // Méthode publique pour générer un rond aléatoire
    public static Rond getRandomRond() {
        Point centre = getRandomPoint();
        int rayon = 1 + random.nextInt(50); // Rayon entre 1 et 50
        return new Rond(centre, rayon);
    }

    // Méthode publique pour générer un rectangle aléatoire
    public static Rectangle getRandomRectangle() {
        Point basGauche = getRandomPoint();
        int largeur = 1 + random.nextInt(50);
        int hauteur = 1 + random.nextInt(50);
        return new Rectangle(basGauche, largeur, hauteur);
    }
}