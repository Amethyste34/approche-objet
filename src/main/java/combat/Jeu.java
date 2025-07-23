package combat;

import java.util.List;
import java.util.Scanner;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe principale de lancement du jeu.
 */
public class Jeu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personnage joueur = null;
        boolean quitter = false;

        while (!quitter) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Créer personnage");
            System.out.println("2. Combattre une créature");
            System.out.println("3. Prendre une potion");
            System.out.println("4. Afficher score");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1 -> {
                    joueur = new Personnage();
                    System.out.println("Personnage créé ! Force : " + joueur.getBaseForce() + ", Santé : " + joueur.getSante());
                }
                case 2 -> {
                    if (joueur == null) System.out.println("Créez d'abord un personnage.");
                    else CombatManager.combattre(joueur);
                }
                case 3 -> {
                    if (joueur == null) System.out.println("Créez d'abord un personnage.");
                    else {
                        System.out.println("Inventaire :");
                        List<Potion> potions = joueur.getInventaire();
                        for (int i = 0; i < potions.size(); i++) {
                            System.out.println((i + 1) + ". " + potions.get(i).getNom());
                        }
                        System.out.print("Quelle potion utiliser ? (0 pour annuler) : ");
                        int pIndex = scanner.nextInt();
                        scanner.nextLine();
                        if (pIndex > 0 && pIndex <= potions.size()) {
                            Potion p = potions.remove(pIndex - 1);
                            p.utiliser(joueur);
                        }
                    }
                }
                case 4 -> {
                    if (joueur == null) System.out.println("Créez d'abord un personnage.");
                    else System.out.println("Score : " + joueur.getScore());
                }
                case 5 -> quitter = true;
                default -> System.out.println("Choix invalide.");
            }
        }

        scanner.close();
        System.out.println("Au revoir !");
    }
}