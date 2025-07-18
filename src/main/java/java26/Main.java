package java26;

public class Main {
    public static void main(String[] args) {
        Dessin dessin = new Dessin();

        // Figures valides
        dessin.ajouter(new Carre(new Point(10, 10), 20));
        dessin.ajouter(new Rond(new Point(30, 30), 5));

        // Figure qui dépasse les limites (X > 99)
        dessin.ajouter(new Rectangle(new Point(90, 90), 20, 20));

        try {
            dessin.affiche();
        } catch (DessinHorsLimiteException e) {
            System.err.println("❌ Erreur : " + e.getMessage());
        }
    }
}