package tpjava10;

public class Rectangle {
    private Point basGauche;
    private int largeur;
    private int hauteur;

    public Rectangle(Point basGauche, int largeur, int hauteur) {
        this.basGauche = basGauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Point getPointBasGauche() {
        return basGauche;
    }

    public Point getPointBasDroit() {
        return new Point(basGauche.getX() + largeur, basGauche.getY());
    }

    public Point getPointHautGauche() {
        return new Point(basGauche.getX(), basGauche.getY() + hauteur);
    }

    public Point getPointHautDroit() {
        return new Point(basGauche.getX() + largeur, basGauche.getY() + hauteur);
    }

    @Override
    public String toString() {
        return "RECT " +
                getPointBasGauche() +
                getPointBasDroit() +
                getPointHautGauche() +
                getPointHautDroit();
    }

    public void affiche() {
        System.out.println(this.toString());
    }
}