package java30;

import java.util.Arrays;
import java.util.Collection;

public class Rectangle extends Figure implements Surfacable {
    public Rectangle(Point p, int largeur, int hauteur) {
        super(p,
                new Point(p.getX() + largeur, p.getY()),
                new Point(p.getX() + largeur, p.getY() + hauteur),
                new Point(p.getX(), p.getY() + hauteur)
        );
    }

    public Rectangle(Point p, int largeur, int hauteur, Couleur couleur) {
        super(couleur,
                p,
                new Point(p.getX() + largeur, p.getY()),
                new Point(p.getX() + largeur, p.getY() + hauteur),
                new Point(p.getX(), p.getY() + hauteur)
        );
    }

    public Rectangle(Couleur couleur, Point... points) {
        super(couleur, points);
    }

    @Override
    public Collection<Point> getPoints() {
        return Arrays.asList(points);
    }

    @Override
    public String getNom() {
        return "Rectangle";
    }

    @Override
    public void affiche() {
        for (Point p : points) {
            System.out.print(p + " ");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle other)) return false;
        return this.getPoints().equals(other.getPoints()) &&
                this.couleur == other.couleur;
    }

    @Override
    public int hashCode() {
        return getPoints().hashCode() * 31 + couleur.hashCode();
    }

    @Override
    public boolean couvre(Point p) {
        // Couverture basique par coordonnées
        int xMin = Math.min(points[0].getX(), points[2].getX());
        int xMax = Math.max(points[0].getX(), points[2].getX());
        int yMin = Math.min(points[0].getY(), points[2].getY());
        int yMax = Math.max(points[0].getY(), points[2].getY());

        return p.getX() >= xMin && p.getX() <= xMax &&
                p.getY() >= yMin && p.getY() <= yMax;
    }

    @Override
    public double surface() {
        int largeur = points[1].getX() - points[0].getX();
        int hauteur = points[3].getY() - points[0].getY();
        return Math.abs(largeur * hauteur);
    }

    @Override
    public String toString() {
        return couleur + " " + Arrays.toString(points);
    }
}