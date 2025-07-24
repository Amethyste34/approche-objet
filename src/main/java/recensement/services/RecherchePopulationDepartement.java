package recensement.services;

import recensement.MenuService;
import recensement.Recensement;
import recensement.Ville;

import java.util.Scanner;

/**
 * @author Laurence SAGOT, auto-formation le 24/07/25
 * Cette classe permet de rechercher la population par département
 * Elle hérite de la classe MenuService
 */
public class RecherchePopulationDepartement extends MenuService {
    /**
     * Traitement option 2 Recherche de population par département
     * @param recensement objet contenant les villes chargées
     * @param scanner pour saisir les données utilisateur
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Code du département : ");
        String code = scanner.nextLine();
        int total = recensement.getVilles().stream()
                .filter(v -> v.getCodeDepartement().equalsIgnoreCase(code))
                .mapToInt(Ville::getPopulationTotale).sum();
        System.out.println("Population du département " + code + " : " + total);
    }
}