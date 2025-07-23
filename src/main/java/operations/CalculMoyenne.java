package operations;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe qui permet de réaliser le calcul d'une moyenne
 */
public class CalculMoyenne {
    private double[] valeurs; // tablau dynamique
    private  int taille; // nombre réel de valeurs ajoutées

    /**
     * Constructeur : initialise un tableau vide avec une capacité initiale de 10
     */
    public CalculMoyenne() {
        this.valeurs = new double[10];
        this.taille = 0;
    }

    /**
     * Ajoute une valeur au tableau si nécessaire
     * @param valeur est la valeur à ajouter
     */
    public void ajout(double valeur) {
        // Agrandissement du tableau si nécessaire
        if (taille >= valeurs.length) {
            double[] nouveauTableau = new double[valeurs.length * 2];
            for (int i = 0 ; i < valeurs.length ; i++) {
                nouveauTableau[i] = valeurs[i];
            }
            valeurs = nouveauTableau;
        }

        valeurs[taille] = valeur;
        taille++;
    }

    /**
     * Clacule la moyenne des valeurs ajoutées
     * @return la moyenne, ou NaN si aucune valeur
     */
    public double calcul() {
        if (taille == 0) {
            System.out.println("Aucune valeur ajoutée, moyenne impossible.");
            return Double.NaN;
        }
        double somme = 0;
        for (int i = 0 ; i < taille ; i++) {
            somme += valeurs[i];
        }
        return somme / taille;
    }
}