package maison;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Cette classe hérite de Piece, elle définit un salon
 */
public class Salon extends Piece {
    /**
     * Constructeur
     * @param superficie est la superficie du salon
     * @param etage est l'étage où se trouve le salon
     * Appel au constructeur de la classe Mère Piece
     */
    public Salon(double superficie, int etage) {
        super(superficie, etage);
    }
}