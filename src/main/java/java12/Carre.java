package java12;

public class Carre {
    private Point[] sommets = new Point[4];

    public Carre(Point origine, int cote) {
        int x = origine.getX();
        int y = origine.getY();
        sommets[0] = new Point(x, y);
        sommets[1] = new Point(x + cote, y);
        sommets[2] = new Point(x + cote, y + cote);
        sommets[3] = new Point(x, y + cote);
    }

    protected  String getType() {
        return "CARRE";
    }

    @Override
    public  String toString() {
        return getType() + " " + sommets[0] + sommets[1] + sommets[2] + sommets[3];
    }

    public void affiche() {
        System.out.println(toString());
    }
}