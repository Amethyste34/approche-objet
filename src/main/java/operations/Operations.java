package operations;

/**
 * @author Laurence SAGOT, auto-formation le 23/07/25
 * @param a premier opérande
 * @param b second operande
 * @param operateur caractère représentant l'opération (+, -, *, /)
 * @return le résultat de l'opération, ou Double.NaN si opérateur non reconnu
 */
public class Operations {
    public static double calcul(double a, double b, char operateur) {
        switch (operateur) {
            case '+' :
                return a + b;
            case '-' :
                return a - b;
            case '*' :
                return a * b;
            case '/' :
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Erreur : division par zéro impossible !");
                    return Double.NaN;
                }
            default :
                System.out.println("Opérateur non reconnu : " + operateur);
                return  Double.NaN;
        }
    }
}