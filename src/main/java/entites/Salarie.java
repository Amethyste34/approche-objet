package entites;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Représente un salarié avec nom, prénom et salaire.
 */
public class Salarie {
    private String nom;
    private String prenom;
    private double salaire;

    /**
     * Constructeur
     * @param nom nom du salarié
     * @param prenom prénom du salarié
     * @param salaire salaire du salarié
     */
    public Salarie(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return nom + " " + prenom + ", salaire : " + salaire + " €";
    }
}