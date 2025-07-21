package java30;

import java.util.Arrays;
import java.util.Collection;

public abstract class Figure implements Comparable<Figure> {
    protected Point[] points;
    protected Couleur couleur;

    // Constructeur utilisé dans les anciennes sous-classes (sans couleur explicite)
    public Figure(Point... points) {
        this(Couleur.getCouleurDefaut(), points);
    }

    // Constructeur complet avec couleur
    public Figure(Couleur couleur, Point... points) {
        this.points = points;
        this.couleur = couleur;
    }

    public Collection<Point> getPoints() {
        return Arrays.asList(points);
    }

    public abstract String getNom();

    public abstract void affiche();

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract int hashCode();

    public abstract boolean couvre(Point p);

    public double distanceOrigine() {
        Point origine = new Point(Point.INIT_X, Point.INIT_Y);
        return getPoints().stream()
                .mapToDouble(p -> p.distance(origine))
                .min()
                .orElse(Double.MAX_VALUE);
    }

    @Override
    public int compareTo(Figure autre) {
        return Double.compare(this.distanceOrigine(), autre.distanceOrigine());
    }

    public Couleur getCouleur() {
        return couleur;
    }
}