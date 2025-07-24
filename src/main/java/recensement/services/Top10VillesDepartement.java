package recensement.services;

import recensement.MenuService;
import recensement.Recensement;
import recensement.Ville;

import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Laurence SAGOT, auto-formation le 24/07/25
 * Cette classe permet d'afficher les 10 villes les plus peuplées d'un département
 * Cette classe hérite de la classe MenuService
 */
public class Top10VillesDepartement extends MenuService {
    /**
     * Traitement de l'option 6 pour afficher les 10 villes les plus peuplées d'un département
     * @param recensement objet contenant les villes chargées
     * @param scanner pour saisir les données utilisateur
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Code du département : ");
        String code = scanner.nextLine();
        recensement.getVilles().stream()
                .filter(v -> v.getCodeDepartement().equalsIgnoreCase(code))
                .sorted(Comparator.comparingInt(Ville::getPopulationTotale).reversed())
                .limit(10).forEach(System.out::println);
    }
}