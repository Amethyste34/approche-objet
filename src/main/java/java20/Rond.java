package java20;

public class Rond extends Figure implements Surfacable {
    private Point centre;
    private int rayon;

    public Rond(Point centre, int rayon) {
        this.centre = new Point(centre);
        this.rayon = rayon;
    }

    @Override
    public void affiche() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ROND [centre=" + centre + ", rayon=" + rayon + "]";
    }

    @Override
    public String getNom() {
        return "Rond";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rond)) return false;
        Rond other = (Rond) obj;
        return this.rayon == other.rayon && this.centre.equals(other.centre);
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public Point[] getPoints() {
        return new Point[]{centre};
    }
}