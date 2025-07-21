package java30;

public class CarreHerite extends Rectangle {

    public CarreHerite(Point p, int cote) {
        super(p, cote, cote);
    }

    public CarreHerite(Point p, int cote, Couleur couleur) {
        super(couleur,
                p,
                new Point(p.getX() + cote, p.getY()),
                new Point(p.getX() + cote, p.getY() + cote),
                new Point(p.getX(), p.getY() + cote));
    }

    @Override
    public String getNom() {
        return "CarreHerite";
    }

    @Override
    public void affiche() {
        System.out.println(getNom() + " " + couleur + " " + toString());
    }

    @Override
    public String toString() {
        return getPoints().toString();
    }
}