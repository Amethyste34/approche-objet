package java21;

import java.util.Collection;
import java.util.List;

public class Segment extends Figure {
    private Point debut;
    private Point fin;
    private boolean horizontal;

    public Segment(Point debut, int longueur, boolean horizontal) {
        this.debut = new Point(debut.getX(), debut.getY()); // copie pour éviter aliasing
        this.horizontal = horizontal;

        if (horizontal) {
            this.fin = new Point(debut.getX() + longueur, debut.getY());
        } else {
            this.fin = new Point(debut.getX(), debut.getY() + longueur);
        }
    }

    public Point getDebut() {
        return debut;
    }

    public Point getFin() {
        return fin;
    }

    public boolean isHorizontal() {
        return horizontal;
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
    public String toString() {
        return "[" + debut + " à " + fin + "]";
    }

    @Override
    public void affiche() {
        System.out.println(getNom() + " : " + toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Segment other = (Segment) obj;
        return debut.equals(other.debut) && fin.equals(other.fin) && horizontal == other.horizontal;
    }

    @Override
    public int hashCode() {
        int result = debut.hashCode();
        result = 31 * result + fin.hashCode();
        result = 31 * result + (horizontal ? 1 : 0);
        return result;
    }
}