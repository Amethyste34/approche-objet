package java26;

public class CarreHerite extends Rectangle {

    public CarreHerite(Point p, int cote) {
        super(p, cote, cote);
    }

    @Override
    public String getNom() {
        return "CarreHerite";
    }

    @Override
    public void affiche() {
        System.out.println(getNom() + " " + toString());
    }

    @Override
    public String toString() {
        return getPoints().toString();
    }

    // equals et hashCode hérités de Rectangle
}