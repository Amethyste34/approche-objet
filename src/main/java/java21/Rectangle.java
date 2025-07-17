package java21;

import java.util.Collection;
import java.util.List;

public class Rectangle extends Figure {
    protected Point p1, p2, p3, p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1; this.p2 = p2; this.p3 = p3; this.p4 = p4;
    }

    public Rectangle(Point p, int largeur, int hauteur) {
        this(p,
                new Point(p.getX() + largeur, p.getY()),
                new Point(p.getX() + largeur, p.getY() + hauteur),
                new Point(p.getX(), p.getY() + hauteur));
    }

    @Override
    public Collection<Point> getPoints() {
        return List.of(p1, p2, p3, p4);
    }

    @Override
    public String getNom() {
        return "Rectangle";
    }

    @Override
    public void affiche() {
        System.out.println(getNom() + " " + toString());
    }

    @Override
    public String toString() {
        return p1 + " " + p2 + " " + p3 + " " + p4;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle other)) return false;
        return p1.equals(other.p1) && p2.equals(other.p2)
                && p3.equals(other.p3) && p4.equals(other.p4);
    }

    @Override
    public int hashCode() {
        int result = p1.hashCode();
        result = 31 * result + p2.hashCode();
        result = 31 * result + p3.hashCode();
        result = 31 * result + p4.hashCode();
        return result;
    }
}