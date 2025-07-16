package java13;

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

    // Pas besoin de redéfinir equals() si celui du Rectangle suffit,
    // mais on peut le faire pour être explicite :
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CarreHerite || obj instanceof Rectangle)) return false;
        return super.equals(obj);
    }
}