package combat;

import java.util.Random;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Créature Loup
 * Classe qui hérite de Creature
 */
public class Loup extends Creature {
    /**
     * Constructeur qui appele le onstructeur parent
     */
    public Loup() {
        super(3 + new Random().nextInt(6), 5 + new Random().nextInt(6), "Loup");
    }
}