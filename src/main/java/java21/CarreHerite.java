package java21;

public class CarreHerite extends Rectangle {

    public CarreHerite(Point p, int cote) {
        super(
                p,
                new Point(p.getX() + cote, p.getY()),
                new Point(p.getX() + cote, p.getY() + cote),
                new Point(p.getX(), p.getY() + cote)
        );
    }

    @Override
    public String getNom() {
        return "CarreHerite";
    }

    @Override
    public String toString() {
        return "CARRE_HERITE " + p1 + p2 + p3 + p4;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);  // même logique que Rectangle/Carre
    }
}