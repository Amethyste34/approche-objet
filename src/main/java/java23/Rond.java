package java23;

import java.util.Collection;
import java.util.List;

public class Rond extends Figure {
    private Point centre;
    private int rayon;

    public Rond(Point centre, int rayon) {
        this.centre = new Point(centre.getX(), centre.getY());
        this.rayon = rayon;
    }

    @Override
    public Collection<Point> getPoints() {
        return List.of(centre);
    }

    @Override
    public String getNom() {
        return "Rond";
    }

    @Override
    public void affiche() {
        System.out.println(getNom() + " centre: " + centre + ", rayon: " + rayon);
    }

    @Override
    public String toString() {
        return "centre: " + centre + ", rayon: " + rayon;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rond other)) return false;
        return centre.equals(other.centre) && rayon == other.rayon;
    }

    @Override
    public int hashCode() {
        return 31 * centre.hashCode() + rayon;
    }

    @Override
    public boolean couvre(Point p) {
        return  centre.distance(p) <= rayon;
    }
}