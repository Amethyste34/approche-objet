package tpjava10;

public class TestFormes {
    public static void main(String[] args) {
        // Test de Point
        Point p = new Point(3, 4);
        System.out.println("Point : " + p); // Affiche : [3;4]

        // Test de Rond
        Rond rond = new Rond(p, 5);
        rond.affiche(); // Affiche : ROND [3;4] , 5

        // Test de Rectangle
        Point coin = new Point(1, 1);
        Rectangle rect = new Rectangle(coin, 4, 3);
        rect.affiche(); // RECT [1;1][5;1][1;4][5;4]
    }
}