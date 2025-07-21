package java30;

import java.util.Collection;
import java.util.List;

public class Rond extends Figure implements Surfacable {
    private Point centre;
    private int rayon;

    public Rond(Couleur couleur, Point centre, int rayon) {
        super(couleur, centre);
        this.centre = centre;
        this.rayon = rayon;
    }

    public Rond(Point centre, int rayon) {
        this(Couleur.getCouleurDefaut(), centre, rayon);
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
        System.out.println(getNom() + " " + couleur + " centre: " + centre + ", rayon: " + rayon);
    }

    @Override
    public String toString() {
        return couleur + " centre: " + centre + ", rayon: " + rayon;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rond other)) return false;
        return couleur == other.couleur && centre.equals(other.centre) && rayon == other.rayon;
    }

    @Override
    public int hashCode() {
        return 31 * (31 * couleur.hashCode() + centre.hashCode()) + rayon;
    }

    @Override
    public boolean couvre(Point p) {
        return centre.distance(p) <= rayon;
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }
}