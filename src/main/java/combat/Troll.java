package combat;

import java.util.Random;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Créature Troll
 * Classe Troll qui hérite de classe Creature
 */
public class Troll extends Creature {
    /**
     * Constructeur qui appele le onstructeur parent
     */
    public Troll() {
        super(10 + new Random().nextInt(6), 20 + new Random().nextInt(11), "Troll");
    }
}