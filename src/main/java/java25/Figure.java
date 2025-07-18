package java25;

import java.util.Arrays;
import java.util.Collection;

public abstract class Figure implements Comparable<Figure> {
    protected Point[] points;

    // Constructeur utile aux sous-classes
    public Figure(Point... points) {
        this.points = points;
    }

    // Méthode par défaut pour retourner les points
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
}