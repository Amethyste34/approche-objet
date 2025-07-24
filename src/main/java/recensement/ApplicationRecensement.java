package recensement;

import fichier.LectureFichierAvecInstanciation;
import recensement.services.*;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Laurence SAGOT, auto-formation le 24/07/25
 *  Classe principale contenant la boucle du menu utilisateur.
 *  * Point d’entrée de l’application de recensement.
 */
public class ApplicationRecensement {

    public static void main(String[] args) {
        try {
            // Chargement du fichier CSV via la classe utilitaire
            Recensement recensement = LectureFichierAvecInstanciation.lire("recensement.csv");

            Scanner scanner = new Scanner(System.in);
            int choix;

            do {
                afficherMenu();
                System.out.print("Votre choix : ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Merci d'entrer un numéro valide !");
                    scanner.next(); // discard invalid
                    System.out.print("Votre choix : ");
                }

                choix = scanner.nextInt();
                scanner.nextLine(); // consommer le retour chariot

                MenuService service = null;

                switch (choix) {
                    case 1 -> service = new RecherchePopulationVille();
                    case 2 -> service = new RecherchePopulationDepartement();
                    case 3 -> service = new RecherchePopulationRegion();
                    case 4 -> service = new Top10Regions();
                    case 5 -> service = new Top10Departements();
                    case 6 -> service = new Top10VillesDepartement();
                    case 7 -> service = new Top10VillesRegion();
                    case 8 -> service = new Top10VillesFrance();
                    case 9 -> System.out.println("Fin du programme.");
                    default -> System.out.println("Choix invalide. Merci de réessayer.");
                }

                if (service != null) {
                    service.traiter(recensement, scanner);
                }

            } while (choix != 9);

        } catch (IOException e) {
            System.err.println("Erreur lors du chargement du fichier : " + e.getMessage());
        }
    }

    /**
     * Affiche le menu principal.
     */
    public static void afficherMenu() {
        System.out.println("\n*********** MENU ***********");
        System.out.println("1. Population d’une ville donnée");
        System.out.println("2. Population d’un département donné");
        System.out.println("3. Population d’une région donnée");
        System.out.println("4. Afficher les 10 régions les plus peuplées");
        System.out.println("5. Afficher les 10 départements les plus peuplés");
        System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
        System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
        System.out.println("8. Afficher les 10 villes les plus peuplées de France");
        System.out.println("9. Sortir");
    }
}