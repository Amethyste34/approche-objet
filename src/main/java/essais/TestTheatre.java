package essais;

import entites.Theatre;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe qui sert à tester la classe Theatre
 */
public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Théatre Comédie", 100);

        theatre.inscrire(30, 12.5);
        theatre.inscrire(40, 10.0);
        theatre.inscrire(20, 15.0);
        // Dépassement de capacité (doit déclencher l'erreur)
        theatre.inscrire(15, 11.0);

        System.out.println("Total clients inscrits : " + theatre.getTotalClients());
        System.out.println("Recette totale : " + theatre.getRecette() + " €");
    }
}