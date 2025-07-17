package java20;

public class CarreHerite extends Rectangle {

    public CarreHerite(Point p, int taille) {
        super(
                new Point(p.getX(), p.getY()),
                new Point(p.getX() + taille, p.getY()),
                new Point(p.getX() + taille, p.getY() + taille),
                new Point(p.getX(), p.getY() + taille)
        );
    }

    @Override
    public String toString() {
        return "CARRE_HERITE " + p1 + p2 + p3 + p4;
    }

    @Override
    public String getNom() {
        return "CarreHerite";
    }

    // equals() hérite de Rectangle (identique)
}