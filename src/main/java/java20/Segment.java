package java20;

public class Segment extends Figure {
    private Point debut;
    private Point fin;

    public Segment(Point debut, int longueur, boolean horizontal) {
        this.debut = new Point(debut);
        if (horizontal) {
            this.fin = new Point(debut.getX() + longueur, debut.getY());
        } else {
            this.fin = new Point(debut.getX(), debut.getY() + longueur);
        }
    }

    @Override
    public void affiche() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "[" + debut + " à " + fin + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Segment)) return false;
        Segment other = (Segment) obj;
        return this.debut.equals(other.debut) && this.fin.equals(other.fin);
    }

    @Override
    public String getNom() {
        return "Segment";
    }

    @Override
    public Point[] getPoints() {
        return new Point[]{debut, fin};
    }
}