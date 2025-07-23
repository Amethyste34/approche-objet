package combat;

import java.util.Random;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Gère les combats entre un personnage et une créature.
 */
public class CombatManager {
    private static final Random random = new Random();

    /**
     * Génère une créature aléatoire parmi Loup, Gobelin ou Troll.
     *
     * @return une instance de créature
     */
    public static Creature genererCreature() {
        int choix = random.nextInt(3);
        return switch (choix) {
            case 0 -> new Loup();
            case 1 -> new Gobelin();
            default -> new Troll();
        };
    }

    /**
     * Déroule un combat entre le personnage et une créature aléatoire.
     * Si le personnage meurt, le score est affiché et le combat s'arrête.
     * Sinon, le score augmente en fonction du type de créature vaincue.
     *
     * @param joueur le personnage qui combat
     */
    public static void combattre(Personnage joueur) {
        if (!joueur.estVivant()) {
            System.out.println("Votre personnage est mort. Score: " + joueur.getScore());
            return;
        }

        Creature creature = genererCreature();
        System.out.println("Une créature approche : " + creature.getNom());

        while (joueur.estVivant() && creature.estVivant()) {
            int atkJoueur = joueur.getForce() + random.nextInt(10) + 1 + joueur.getBonusTemporaire();
            int atkCreature = creature.getForce() + random.nextInt(10) + 1;

            if (atkJoueur > atkCreature) {
                int degats = atkJoueur - atkCreature;
                creature.setSante(creature.getSante() - degats);
                System.out.println("Vous infligez " + degats + " de dégâts au " + creature.getNom());
            } else if (atkCreature > atkJoueur) {
                int degats = atkCreature - atkJoueur;
                joueur.setSante(joueur.getSante() - degats);
                System.out.println("Le " + creature.getNom() + " vous inflige " + degats + " de dégâts !");
            } else {
                System.out.println("Égalité, aucun dégât infligé.");
            }

            // Affichage de l'état après chaque tour
            System.out.println("Votre santé : " + joueur.getSante() + " | Santé du " + creature.getNom() + " : " + creature.getSante());
        }

        joueur.decrementerBoost();

        if (!joueur.estVivant()) {
            System.out.println("Vous êtes mort ! Score final : " + joueur.getScore());
        } else {
            int gain = switch (creature.getNom()) {
                case "Loup" -> 1;
                case "Gobelin" -> 2;
                case "Troll" -> 5;
                default -> 0;
            };
            joueur.addScore(gain);
            System.out.println("Vous avez vaincu le " + creature.getNom() + ". Score +" + gain);
            dropAleatoire(joueur);
        }
    }

    /**
     * Après un combat gagné, donne une récompense aléatoire au joueur :
     * - potion de soin
     * - potion d’attaque mineure
     * - potion d’attaque majeure
     * - ou +5 points de score
     *
     * @param joueur le personnage récompensé
     */
    private static void dropAleatoire(Personnage joueur) {
        if (random.nextDouble() < 0.5) {
            int type = random.nextInt(4);
            Potion p = switch (type) {
                case 0 -> new PotionSoin();
                case 1 -> new PotionAttaqueMineure();
                case 2 -> new PotionAttaqueMajeure();
                default -> null;
            };
            if (p != null) {
                joueur.ajouterPotion(p);
                System.out.println("Vous avez reçu une potion : " + p.getNom());
            } else {
                joueur.addScore(5);
                System.out.println("Chance ! Score +5 !");
            }
        }
    }
}