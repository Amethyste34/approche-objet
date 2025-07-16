package java13;

public class Carre {
    private Point p1, p2, p3, p4;

    public Carre(Point p, int taille) {
        int x = p.getX();
        int y = p.getY();
        this.p1 = new Point(x, y);
        this.p2 = new Point(x + taille, y);
        this.p3 = new Point(x + taille, y + taille);
        this.p4 = new Point(x, y + taille);
    }

    public void affiche() {
        System.out.println(toString());
    }

    public String toString() {
        return "CARRE " + p1 + p2 + p3 + p4;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Carre)) return false;
        Carre other = (Carre) obj;
        return this.p1.equals(other.p1) &&
                this.p2.equals(other.p2) &&
                this.p3.equals(other.p3) &&
                this.p4.equals(other.p4);
    }
}