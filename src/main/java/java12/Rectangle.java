package java12;

public class Rectangle {
    protected  Point[] sommets = new Point[4];

    public Rectangle(Point origine, int largeur, int hauteur) {
        int x = origine.getX();
        int y = origine.getY();
        sommets[0] = new Point(x, y);
        sommets[1] = new Point(x + largeur, y);
        sommets[2] = new Point(x + largeur, y + hauteur);
        sommets[3] = new Point(x, y + hauteur);
    }

    protected String getType() {
        return  "RECT";
    }

    @Override
    public String toString() {
        return getType() + " " + sommets[0] + sommets[1] + sommets[2] + sommets[3];
    }

    public void affiche() {
        System.out.println(toString());
    }
}