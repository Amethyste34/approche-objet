package java23;

public class CarreHerite extends Rectangle {

    public CarreHerite(Point p, int cote) {
        super(p,
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
        System.out.println(getNom() + " " + toString());
    }

    // equals et hashCode hérités de Rectangle
}