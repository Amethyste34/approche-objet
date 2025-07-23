package maison;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Cette classe hérite de Piece, elle définit une cuisine
 */
public class Cuisine extends Piece {
    /**
     * Constructeur
     * @param superficie est la superficie de la cuisine
     * @param etage est l'étage où se trouve la cuisine
     * Appel au constructeur de la classe Mère Piece
     */
    public Cuisine(double superficie, int etage) {
        super(superficie, etage);
    }
}