package combat;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe abstraite représentant une potion
 */
public abstract class Potion {
    protected String nom;

    /** Constructeur de potion. */
    public Potion(String nom) {
        this.nom = nom;
    }

    /** Renvoie le nom de la potion. */
    public String getNom() {
        return nom;
    }

    /** Applique l'effet de la potion sur le personnage. */
    public abstract void utiliser(Personnage p);
}