package recensement.services;

import recensement.MenuService;
import recensement.Recensement;
import recensement.Ville;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Laurence SAGOT, auto-formation le 24/07/25
 * Cette classe permet d'afficher les 10 départements les plus peuplés
 * Cette classe hérite de la classe MenuService
 */
public class Top10Departements extends MenuService {
    /**
     * Traitement option 5 pour afficher les 10 départements les plus peuplés
     * @param recensement objet contenant les villes chargées
     * @param scanner pour saisir les données utilisateur
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Integer> map = new HashMap<>();
        for (Ville v : recensement.getVilles()) {
            map.merge(v.getCodeDepartement(), v.getPopulationTotale(), Integer::sum);
        }
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(e -> System.out.println("Département " + e.getKey() + " : " + e.getValue()));
    }
}