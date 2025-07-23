package combat;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Potion Attaque Mineure : +3 force (1 combat)
 * La classe PotionAttaqueMineure hérite de la classe Potion
 */
public class PotionAttaqueMineure extends Potion {
    /** Constructeur qui appelle le constructeur parent */
    public PotionAttaqueMineure() {
        super("Potion Attaque Mineure");
    }

    /**
     * Applique l'effet de la potion sur le personnage.
     * @param Personnage p personnage qui utilisera la potionSoin
     */
    @Override
    public void utiliser(Personnage p) {
        p.appliquerBoost(3, 1);
        System.out.println("+3 attaque pour le prochain combat.");
    }
}