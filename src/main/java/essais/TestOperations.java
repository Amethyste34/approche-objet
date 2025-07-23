package essais;

import operations.Operations;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * Classe qui permet de réaliser les tests d'opération sur la classe Operations
 */
public class TestOperations {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;

        System.out.println("Addition " + Operations.calcul(a, b, '+'));
        System.out.println("Soustraction " + Operations.calcul(a, b, '-'));
        System.out.println("Multiplication " + Operations.calcul(a, b, '*'));
        System.out.println("Division " + Operations.calcul(a, b, '/'));

        // Test avec opérateur inconnu
        System.out.println("Opérateur inconnu : " + Operations.calcul(a, b, '%'));

        // Test division par zéro
        System.out.println("Division par zéro : " + Operations.calcul(a, 0, '/'));
    }
}