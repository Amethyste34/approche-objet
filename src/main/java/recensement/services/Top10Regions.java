package recensement.services;

import recensement.MenuService;
import recensement.Recensement;
import recensement.Ville;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Laurence SAGOT, auto-formation le 24/07/25
 * Cette classe permet d'afficher les 10 régions les plus peuplées
 * Cette classe hérite de la classe MenuService
 */
public class Top10Regions extends MenuService {
    /**
     * Traitement option 4 pour afficher les 10 régions les plus peuplées
     * @param recensement objet contenant les villes chargées
     * @param scanner pour saisir les données utilisateur
     */
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Integer> map = new HashMap<>();
        for (Ville v : recensement.getVilles()) {
            map.merge(v.getNomRegion(), v.getPopulationTotale(), Integer::sum);
        }
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}