package maison;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Cette classe hérite de Piece, elle définit un WC
 */
public class WC extends Piece {
    /**
     * Constructeur
     * @param superficie est la superficie du WC
     * @param etage est l'étage où se trouve le WC
     * Appel au constructeur de la classe Mère Piece
     */
    public WC(double superficie, int etage) {
        super(superficie, etage);
    }
}