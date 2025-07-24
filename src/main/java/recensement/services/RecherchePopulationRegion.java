package recensement.services;

import recensement.MenuService;
import recensement.Recensement;
import recensement.Ville;

import java.util.Scanner;

/**
 * @author Laurence SAGOT, auto-formation le 24/07/25
 * Cette classe permet de rechercher la population par région
 *  * Elle hérite de la classe MenuService
 */
public class RecherchePopulationRegion extends MenuService {
    /**
     * Traitement option 3 Recherche de population par région
     * @param recensement
     * @param scanner
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Nom de la région : ");
        String nom = scanner.nextLine();
        int total = recensement.getVilles().stream()
                .filter(v -> v.getNomRegion().equalsIgnoreCase(nom))
                .mapToInt(Ville::getPopulationTotale).sum();
        System.out.println("Population de la région " + nom + " : " + total);
    }
}