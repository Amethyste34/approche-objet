package combat;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe abstraite représentant une créature.
 */
public abstract class Creature {
    protected int force;
    protected int sante;
    protected String nom;

    /**
     * Constructeur de la créature.
     */
    public Creature(int force, int sante, String nom) {
        this.force = force;
        this.sante = sante;
        this.nom = nom;
    }

    /**
     * Renvoie la force de la créature.
     */
    public int getForce() {
        return force;
    }

    /**
     * Renvoie la santé de la créature.
     */
    public int getSante() {
        return sante;
    }

    /**
     * Modifie la santé de la créature.
     */
    public void setSante(int sante) {
        this.sante = sante;
    }

    /**
     * Renvoie le nom de la créature.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Indique si la créature est encore en vie.
     */
    public boolean estVivant() {
        return sante > 0;
    }
}