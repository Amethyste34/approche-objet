package combat;

import java.util.Random;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Créature Gobelin
 * Classe Gobelin hérite de la classe Creature
 */
public class Gobelin extends Creature {
    /**
     * Constructeur qui appele le onstructeur parent
     */
    public Gobelin() {
        super(5 + new Random().nextInt(6), 10 + new Random().nextInt(6), "Gobelin");
    }
}