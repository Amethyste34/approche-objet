package java30;

import java.util.Collection;
import java.util.List;

public class Segment extends Figure {
    private Point debut, fin;
    private boolean horizontal;

    public Segment(Point debut, int longueur, boolean horizontal) {
        this.debut = new Point(debut.getX(), debut.getY());
        this.horizontal = horizontal;
        if (horizontal) {
            this.fin = new Point(debut.getX() + longueur, debut.getY());
        } else {
            this.fin = new Point(debut.getX(), debut.getY() + longueur);
        }
    }

    @Override
    public Collection<Point> getPoints() {
        return List.of(debut, fin);
    }

    @Override
    public String getNom() {
        return "Segment";
    }

    @Override
    public void affiche() {
        System.out.println(getNom() + " " + toString());
    }

    @Override
    public String toString() {
        return "[" + debut + " à " + fin + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Segment other)) return false;
        return debut.equals(other.debut) && fin.equals(other.fin) && horizontal == other.horizontal;
    }

    @Override
    public int hashCode() {
        int result = debut.hashCode();
        result = 31 * result + fin.hashCode();
        result = 31 * result + (horizontal ? 1 : 0);
        return result;
    }

    @Override
    public boolean couvre(Point p) {
        return false; // Segment ne couvre jamais rien, car non utilisé ici
    }
}