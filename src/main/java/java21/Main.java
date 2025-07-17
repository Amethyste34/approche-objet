package java21;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Test de création manuelle de Figures ===");

        Point p = new Point(10, 10);
        Rectangle rect = new Rectangle(p, 20, 10);
        Carre carre = new Carre(new Point(5, 5), 15);
        CarreHerite carreHerite = new CarreHerite(new Point(0, 0), 12);

        System.out.println(rect.getNom() + " : " + rect);
        System.out.println(carre.getNom() + " : " + carre);
        System.out.println(carreHerite.getNom() + " : " + carreHerite);

        System.out.println("\nPoints du Rectangle :");
        for (Point pt : rect.getPoints()) {
            System.out.println(pt);
        }

        System.out.println("\nPoints du Carré :");
        for (Point pt : carre.getPoints()) {
            System.out.println(pt);
        }

        System.out.println("\nPoints du Carré Hérité :");
        for (Point pt : carreHerite.getPoints()) {
            System.out.println(pt);
        }

        System.out.println("\n=== Test de génération aléatoire avec FigureUtil ===");
        Collection<Figure> figures = FigureUtil.genere(5);

        int i = 1;
        for (Figure f : figures) {
            System.out.println("Figure " + i + " : " + f.getNom() + " -> " + f);
            System.out.println("Points : " + f.getPoints());
            i++;
        }

        System.out.println("\n=== Test méthode affiche() ===");
        for (Figure f : figures) {
            f.affiche();
        }
    }
}