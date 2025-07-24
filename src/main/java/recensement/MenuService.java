package recensement;

import java.util.Scanner;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe abstraite que doivent étendre tous les services liés au menu.
 * Elle impose une méthode de traitement spécifique à chaque option du menu.
 * Chaque classe hérite de MenuService et implémente `traiter()`.
 */
public abstract class MenuService {
    /**
     * Méthode abstraite de traitement des options du menu.
     *
     * @param recensement objet contenant les villes chargées
     * @param scanner pour saisir les données utilisateur
     */
    public abstract void traiter(Recensement recensement, Scanner scanner);
}