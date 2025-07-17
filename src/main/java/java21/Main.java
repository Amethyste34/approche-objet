package java21;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Génération de figures aléatoires ===");
        Collection<Figure> figures = FigureUtil.genere(6);

        for (Figure f : figures) {
            System.out.print(f.getNom() + " : ");
            f.affiche();
        }

        System.out.println("\n=== Création d'un dessin ===");
        Dessin dessin = new Dessin();

        for (Figure f : figures) {
            dessin.add(f);
        }

        System.out.println("Figures dans le dessin :");
        for (Figure f : dessin.getFigures()) {
            System.out.print(f.getNom() + " : ");
            f.affiche();
        }

        System.out.println("\n=== Tous les points des figures ===");
        Collection<Point> points = FigureUtil.getPoints(figures.toArray(new Figure[0]));
        for (Point p : points) {
            System.out.println(p);
        }
    }
}