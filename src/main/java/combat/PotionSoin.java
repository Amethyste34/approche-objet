package combat;

import java.util.Random;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe PotionSoin hérite de la classe Potion
 * Potion de soin : +5 à +10 PV
 */
public class PotionSoin extends Potion {
    /** Constructeur qui appelle le constructeur parent */
    public PotionSoin() {
        super("Potion de soin");
    }

    /**
     * Applique l'effet de la potion sur le personnage.
     * @param Personnage p personnage qui utilisera la potionSoin
     */
    @Override
    public void utiliser(Personnage p) {
        int soin = 5 + new Random().nextInt(6);
        p.setSante(p.getSante() + soin);
        System.out.println("Vous avez récupéré " + soin + " PV.");
    }
}