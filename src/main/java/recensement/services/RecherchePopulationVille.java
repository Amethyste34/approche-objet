package recensement.services;

import recensement.MenuService;
import recensement.Recensement;

import java.util.Scanner;

/**
 * @author Laurence SAGOT, auto-formation le 24/07/25
 * Cette classe permet de faire une recherche de population par ville
 * Elle hérite de la classe MenuService
 */
public class RecherchePopulationVille extends MenuService {
    /**
     * Traitement option 1 Recherche population par ville
     * @param recensement objet contenant les villes chargées
     * @param scanner pour saisir les données utilisateur
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Nom de la ville : ");
        String nom = scanner.nextLine();
        recensement.getVilles().stream()
                .filter(v -> v.getNomCommune().equalsIgnoreCase(nom))
                .findFirst()
                .ifPresentOrElse(
                        v -> System.out.println("Population de " + nom + " : " + v.getPopulationTotale()),
                        () -> System.out.println("Ville introuvable."));
    }
}