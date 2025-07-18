package java24;

import java.util.Objects;

public class Carre extends Rectangle {
    private final int cote;

    public Carre(Point p, int cote) {
        super(p, cote, cote);
        this.cote = cote;
    }

    @Override
    public String getNom() {
        return "Carre";
    }

    @Override
    public void affiche() {
        System.out.println(getNom() + " " + this);
    }

    @Override
    public String toString() {
        return getPoints().toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle r = (Rectangle) obj;
        return this.getPoints().containsAll(r.getPoints()) && r.getPoints().containsAll(this.getPoints());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoints());
    }
}