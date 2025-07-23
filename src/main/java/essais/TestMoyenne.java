package essais;

import operations.CalculMoyenne;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe de test pour le calcul de la moyenne
 */
public class TestMoyenne {
    public static void main(String[] args) {
        // Test 1 : moyenne de quelques notes
        CalculMoyenne moyenneNotes = new CalculMoyenne();
        moyenneNotes.ajout(15.5);
        moyenneNotes.ajout(13.0);
        moyenneNotes.ajout(17.5);
        System.out.println("Moyenne des notes : " + moyenneNotes.calcul());

        // Test 2 : ajout en masse pour tester l'agrandissement du tableau
        CalculMoyenne moyenneGrand = new CalculMoyenne();
        for (int i = 1 ; i <= 25 ; i++) {
            moyenneGrand.ajout(i); // Ajoute de 1 à 25
        }
        System.out.println("Moyenne de 1 à 25 : " + moyenneGrand.calcul());

        // Test 3 : aucun ajout
        CalculMoyenne moyenneVide = new CalculMoyenne();
        System.out.println("Moyenne vide : " + moyenneVide.calcul());
    }
}