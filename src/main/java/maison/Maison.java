package maison;

import java.util.ArrayList;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe qui définit une maison
 */
public class Maison {
    /** Liste de pièces */
    private ArrayList<Piece> pieces = new ArrayList<>();

    /**
     * Ajoute une pièce si elle est valide (non null, superficie et étage ≥ 0)
     * @param piece la pièce à ajouter
     */
     public void ajouterPiece(Piece piece) {
         if (piece == null) {
             System.out.println("Erreur : pièce null non ajoutée.");
             return;
         }
         if (piece.getSuperficie() < 0 || piece.getEtage() < 0) {
             System.out.println("Erreur : pièce invalide (superficie ou étage négatif).");
             return;
         }
         pieces.add(piece);
     }

    /** Superficie totale de la maison */
    public double getSuperficieTotale() {
        double total = 0;
        for (Piece p : pieces) {
            total += p.getSuperficie();
        }
        return total;
    }

    /** Superficie totale à un étage donné */
    public double getSuperficieEtage(int etage) {
        double total = 0;
        for (Piece p : pieces) {
            if (p.getEtage() == etage) {
                total += p.getSuperficie();
            }
        }
        return total;
    }

    /** Superficie totale pour un type de pièce donné */
    public double getSuperficieParType(Class<?> type) {
        double total = 0;
        for (Piece p : pieces) {
            if (p.getClass().equals(type)) {
                total += p.getSuperficie();
            }
        }
        return total;
    }

    /** Nombre de pièces pour un type donné */
    public int getNbPiecesParType(Class<?> type) {
        int count = 0;
        for (Piece p : pieces) {
            if (p.getClass().equals(type)) {
                count++;
            }
        }
        return count;
    }
}