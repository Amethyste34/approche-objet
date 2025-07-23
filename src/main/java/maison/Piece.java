package maison;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Cette classe abstraite définit une pièce de maison
 */
public abstract class Piece {
    protected double superficie;
    protected int etage;

    public Piece(double superficie, int etage) {
        this.superficie = superficie;
        this.etage = etage;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getEtage() {
        return etage;
    }
}