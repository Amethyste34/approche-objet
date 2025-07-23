package entites;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Représente un théâtre avec une capacité, un nombre de clients inscrits
 * et une recette totale
 */
public class Theatre {
    /** Nom du Théâtre */
    private String nom;
    /** Capacité maximale en nombre de personnes */
    private int capaciteMax;
    /** Total des clients actuellement inscrits */
    private int totalClients;
    /** Recette totale en euros */
    private double recette;

    /**
     * Constructeur
     * @param nom nom du théâtre
     * @param capaciteMax capacité maximale de clients
     */
    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalClients = 0;
        this.recette = 0.0;
    }

    /**
     * Inscrit un nombre de clients si la capacité le permet,
     * et met à jour la recette.
     * @param nombreClients nombre de clients à inscrire
     * @param prixPlace prix unitaire d'une place
     */
    public void inscrire(int nombreClients, double prixPlace) {
        if (totalClients + nombreClients <= capaciteMax) {
            totalClients += nombreClients;
            recette += nombreClients * prixPlace;
        } else {
            System.out.println("Erreur : capacité maximale atteinte. Inscription refusée.");
        }
    }

    // Getters pour afficher les infos dans TestTheatre
    public  int getTotalClients() {
        return totalClients;
    }

    public double getRecette() {
        return recette;
    }
}