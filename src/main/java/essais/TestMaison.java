package essais;


import maison.*;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe de test pour tester la classe Maison
 */
public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();

        // Ajout de pièces valides
        maison.ajouterPiece(new Chambre(12.5, 0));
        maison.ajouterPiece(new Salon(25.0, 0));
        maison.ajouterPiece(new Cuisine(10.0, 0));
        maison.ajouterPiece(new Chambre(14.0, 1));
        maison.ajouterPiece(new SalleDeBain(6.5, 1));
        maison.ajouterPiece(new WC(2.0, 1));

        // Test pièce null
        maison.ajouterPiece(null);

        // Test pièce invalide (superficie ou étage négatif)
        maison.ajouterPiece(new WC(-3.0, 0));
        maison.ajouterPiece(new Chambre(10.0, -1));

        // Affichages de test
        System.out.println("Superficie totale : " + maison.getSuperficieTotale() + " m²");
        System.out.println("Superficie du RDC : " + maison.getSuperficieEtage(0) + " m²");
        System.out.println("Superficie du 1er étage : " + maison.getSuperficieEtage(1) + " m²");

        System.out.println("Superficie des chambres : " + maison.getSuperficieParType(Chambre.class) + " m²");
        System.out.println("Nombre de chambres : " + maison.getNbPiecesParType(Chambre.class));
    }
}