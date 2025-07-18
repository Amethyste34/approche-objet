package java24;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Dessin dessin = new Dessin();

        // Ajout manuel de quelques figures pour garantir un Carre
        dessin.ajouter(new Rectangle(new Point(50, 50), 10, 10));
        dessin.ajouter(new Carre(new Point(10, 10), 20));
        dessin.ajouter(new CarreHerite(new Point(50, 50), 10));
        dessin.ajouter(new Rond(new Point(30, 30), 5));

        System.out.println("===   Figures originales   ===");
        for (Figure f : dessin.getFigures()) {
            System.out.println(f.getNom() + " : " + f);
        }

        System.out.println("\n===   Figures triées par distance par rapport à l'origine (25,25)   ===");
        for (Figure f : FigureUtil.trieProcheOrigine(dessin)) {
            System.out.printf("Distance : %.2f -> %s : %s%n", f.distanceOrigine(), f.getNom(), f);
        }

        System.out.println("\n===   Figures triées par surface décroissante   ===");
        for (Figure f : FigureUtil.trieDominant(dessin)) {
            if (f instanceof Surfacable s) {
                System.out.printf("Surface : %.2f -> %s : %s%n", s.surface(), f.getNom(), f);
            }
        }
    }
}