package java12;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Test Carre (sans héritage) ===");
        Carre c1 = new Carre(new Point(2, 3), 4);
        c1.affiche();

        System.out.println("\n=== Test CarreHerite (hérite de Rectangle) ===");
        CarreHerite c2 = new CarreHerite(new Point(5, 1), 3);
        c2.affiche();
    }
}