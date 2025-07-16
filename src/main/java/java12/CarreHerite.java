package java12;

public class CarreHerite extends Rectangle {
    public CarreHerite(Point origine, int cote) {
        super(origine, cote, cote);
    }

    @Override
    protected String getType() {
        return "CARRE";
    }

    @Override
    public void affiche() {
        System.out.println(toString());
    }
}