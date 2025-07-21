package java30;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Rond extends Figure implements Surfacable {
    private Point centre;
    private int rayon;

    // Constructeur sans couleur, utilise couleur par défaut
    public Rond(Point centre, int rayon) {
        super(centre);  // couleur par défaut via Figure(Point... points)
        this.centre = new Point(centre.getX(), centre.getY());
        this.rayon = rayon;
    }

    // Constructeur avec couleur
    public Rond(Point centre, int rayon, Couleur couleur) {
        super(couleur, centre); // couleur explicite + point centre
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
        System.out.println(getNom() + " " + toString());
    }

    @Override
    public String toString() {
        return couleur.getCode() + " centre: " + centre + ", rayon: " + rayon;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rond other)) return false;
        return this.rayon == other.rayon &&
                this.centre.equals(other.centre) &&
                this.couleur == other.couleur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(centre, rayon, couleur);
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