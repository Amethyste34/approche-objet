package java30;

import java.util.Objects;

public class Carre extends Rectangle {
    private final int cote;

    public Carre(Point p, int cote) {
        super(p, cote, cote);
        this.cote = cote;
    }

    public Carre(Point p, int cote, Couleur couleur) {
        super(p, cote, cote, couleur);
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
        return couleur.getCode() + " " + getPoints();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Carre other)) return false;
        return this.getPoints().equals(other.getPoints()) &&
                this.couleur == other.couleur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoints(), couleur);
    }
}