package recensement.services;

import recensement.MenuService;
import recensement.Recensement;
import recensement.Ville;

import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Laurence SAGOT, auto-formation le 24/07/25
 * Cette classe permet d'afficher les 10 villes les plus peuplées d'une région
 * Cette classe hérite de la classe MenuService
 */
public class Top10VillesRegion extends MenuService {
    /**
     * Traitement de l'option 7 permet d'afficher les 10 villes les plus peuplées d'une région
     * @param recensement objet contenant les villes chargées
     * @param scanner pour saisir les données utilisateur
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Nom de la région : ");
        String nom = scanner.nextLine();
        recensement.getVilles().stream()
                .filter(v -> v.getNomRegion().equalsIgnoreCase(nom))
                .sorted(Comparator.comparingInt(Ville::getPopulationTotale).reversed())
                .limit(10).forEach(System.out::println);
    }
}