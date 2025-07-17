package java21;

import java.util.Collection;
import java.util.List;

public class Rectangle extends Figure {
    protected Point p1, p2, p3, p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    // Option alternative : constructeur par coin + largeur + hauteur
    public Rectangle(Point p, int largeur, int hauteur) {
        this(p,
                new Point(p.getX() + largeur, p.getY()),
                new Point(p.getX() + largeur, p.getY() + hauteur),
                new Point(p.getX(), p.getY() + hauteur));
    }

    @Override
    public Collection<Point> getPoints() {
        return List.of(p1, p2, p3, p4);  // OK de retourner List (qui est Collection)
    }

    @Override
    public String getNom() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "RECTANGLE " + p1 + p2 + p3 + p4;
    }

    @Override
    public void affiche() {
        System.out.println(this.getNom() + " : " + this.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Rectangle other) {
            // Deux rectangles sont égaux si leurs 4 points sont égaux (ordre identique)
            return p1.equals(other.p1) && p2.equals(other.p2)
                    && p3.equals(other.p3) && p4.equals(other.p4);
        }

        // Un carré peut être égal à un rectangle, donc on peut vérifier si obj est un Carre
        if (obj instanceof Carre carre) {
            return this.equals((Rectangle) carre); // Carre hérite de Rectangle donc cast OK
        }

        return false;
    }
}