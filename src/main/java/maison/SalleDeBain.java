package maison;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Cette classe hérite de Piece, elle définit une salle de bain
 */
public class SalleDeBain extends Piece {
    /**
     * Constructeur
     * @param superficie est la superficie de la salle de bain
     * @param etage est l'étage où se trouve la salle de bain
     * Appel au constructeur de la classe Mère Piece
     */
    public SalleDeBain(double superficie, int etage) {
        super(superficie, etage);
    }
}