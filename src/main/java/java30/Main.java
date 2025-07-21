package java30;

public class Main {
    public static void main(String[] args) {
        Dessin dessin = new Dessin();

        // Créer des figures avec couleurs différentes
        Carre carreRouge = new Carre(new Point(10, 10), 20, Couleur.ROUGE);
        Rond rondBleu = new Rond(Couleur.BLEU, new Point(30, 30), 5);
        Rectangle rectangleNoir = new Rectangle(new Point(50, 50), 15, 10, Couleur.NOIR);
        Carre carreVert = new Carre(new Point(60, 60), 10, Couleur.VERT);

        // Ajouter au dessin
        dessin.ajouter(carreRouge);
        dessin.ajouter(rondBleu);
        dessin.ajouter(rectangleNoir);
        dessin.ajouter(carreVert);

        // Affichage des figures avec leurs couleurs
        System.out.println("=== Figures avec leurs couleurs ===");
        for (Figure f : dessin.getFigures()) {
            System.out.println(f.getNom() + " [" + f.getCouleur() + "] : " + f);
        }

        // Tester égalité en tenant compte de la couleur
        Carre carreRouge2 = new Carre(new Point(10, 10), 20, Couleur.ROUGE);
        Carre carreRouge3 = new Carre(new Point(10, 10), 20, Couleur.NOIR);

        System.out.println("\ncarreRouge equals carreRouge2 ? " + carreRouge.equals(carreRouge2)); // true
        System.out.println("carreRouge equals carreRouge3 ? " + carreRouge.equals(carreRouge3)); // false
    }
}
