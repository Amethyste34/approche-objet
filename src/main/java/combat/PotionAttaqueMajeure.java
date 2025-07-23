package combat;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Potion Attaque Majeure : +5 force (2 combats)
 * La classe PotionAttaqueMajeure hérite de la classe Potion
 */
public class PotionAttaqueMajeure extends Potion {
    /** Constructeur qui appelle le constructeur parent */
    public PotionAttaqueMajeure() {
        super("Potion Attaque Majeure");
    }

    /**
     * Applique l'effet de la potion sur le personnage.
     * @param Personnage p personnage qui utilisera la potionSoin
     */
    @Override
    public void utiliser(Personnage p) {
        p.appliquerBoost(5, 2);
        System.out.println("+5 attaque pour les 2 prochains combats.");
    }
}