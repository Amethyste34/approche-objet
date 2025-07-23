package combat;

import java.util.*;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Représente un personnage du jeu avec force, santé, score et inventaire de potions.
 */
public class Personnage {
    private int force;
    private int sante;
    private int score;
    private List<Potion> inventaire = new ArrayList<>();
    private int boostAttaque = 0;
    private int toursBoost = 0;
    private int bonusTemporaire = 0;

    /**
     * Constructeur du personnage avec génération aléatoire des attributs
     * et potions initiales.
     */
    public Personnage() {
        Random rand = new Random();
        this.force = 12 + rand.nextInt(7);
        this.sante = 20 + rand.nextInt(31);
        this.score = 0;
        inventaire.add(new PotionSoin());
        inventaire.add(new PotionAttaqueMineure());
        inventaire.add(new PotionAttaqueMajeure());
    }

    /**
     * Renvoie la force totale du personnage (base + boost).
     */
    public int getForce() {
        return force + boostAttaque;
    }

    /**
     * Renvoie la force de base du personnage (hors boost).
     */
    public int getBaseForce() {
        return force;
    }

    /**
     * Renvoie la santé actuelle du personnage.
     */
    public int getSante() {
        return sante;
    }

    /**
     * Modifie la santé du personnage.
     */
    public void setSante(int sante) {
        this.sante = sante;
    }

    /**
     * Renvoie le score actuel du personnage.
     */
    public int getScore() {
        return score;
    }

    /**
     * Ajoute des points au score du personnage.
     */
    public void addScore(int points) {
        this.score += points;
    }

    /**
     * Renvoie l'inventaire de potions du personnage.
     */
    public List<Potion> getInventaire() {
        return inventaire;
    }

    /**
     * Ajoute une potion à l'inventaire.
     */
    public void ajouterPotion(Potion p) {
        inventaire.add(p);
    }

    /**
     * Applique un boost temporaire à l'attaque.
     */
    public void appliquerBoost(int boost, int tours) {
        this.boostAttaque = boost;
        this.toursBoost = tours;
    }

    /**
     * Décrémente les tours de boost et le réinitialise si écoulé.
     */
    public void decrementerBoost() {
        if (toursBoost > 0) {
            toursBoost--;
            if (toursBoost == 0) {
                boostAttaque = 0;
            }
        }
    }

    /**
     * Indique si le personnage est encore en vie.
     */
    public boolean estVivant() {
        return sante > 0;
    }

    /**
     * Renvoie le bonus d'attaque temporaire du personnage (0 si aucun).
     * @return le bonus temporaire
     */
    public int getBonusTemporaire() {
        return bonusTemporaire;
    }

}